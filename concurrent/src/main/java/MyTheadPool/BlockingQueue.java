package MyTheadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
@Slf4j
public class BlockingQueue<T> {
    //阻塞队列容量
    private int queueCapacity;
    //双向链表
    private Deque<T> queue;
    //锁
    private ReentrantLock lock;
    private Condition fullWaitSet;
    private Condition emptyWaitSet;
    public BlockingQueue(int queueCapacity) {
        queue=new ArrayDeque<>(queueCapacity);
        this.queueCapacity = queueCapacity;
        lock = new ReentrantLock();
        fullWaitSet = lock.newCondition();
        emptyWaitSet = lock.newCondition();
    }

    public T poll(long timeout,TimeUnit unit){
        lock.lock();
        try {
            long nanaos = unit.toNanos(timeout);
            while (queue.isEmpty()){
                try {
                    if (nanaos<0){
                        return null;
                    }
                    nanaos = emptyWaitSet.awaitNanos(nanaos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = queue.removeFirst();
            fullWaitSet.signal();
            return t;
        } finally {
            lock.unlock();
        }
    }

    public T take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                try {
                    emptyWaitSet.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = queue.removeFirst();
            fullWaitSet.signal();
            return t;
        }finally {
            lock.unlock();
        }
    }
    // 添加
    public void put(T task) {
        lock.lock();
        try {
            while (queue.size() == queueCapacity) {
                try {
                    log.info("等待加入任务队列 {}", task);
                    fullWaitSet.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            log.info("加入任务队列 {}", task);
            queue.addLast(task);
            emptyWaitSet.signal();
        }finally {
            lock.unlock();
        }
    }

    // 带有超时时间的添加
    public boolean offer(T task, long timeout, TimeUnit unit) {
        lock.lock();
        try {
            long nanos = unit.toNanos(timeout);
            while (queue.size() == queueCapacity) {
                try {
                    if(nanos <= 0) {
                        return false;
                    }
                    log.info("等待加入任务队列 {}", task);
                    nanos = fullWaitSet.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            log.info("加入任务队列 {}", task);
            queue.addLast(task);
            emptyWaitSet.signal();
            return true;
        }finally {
            lock.unlock();
        }
    }

    public void tryPut(RejectPolicy<T> rejectPolicy, T task) {
        lock.lock();
        try {
            // 判断判断是否满
            if(queue.size() == queueCapacity) {
                rejectPolicy.reject(this, task);
            } else { // 有空闲
                log.info("加入任务队列 {}", task);
                queue.addLast(task);
                emptyWaitSet.signal();
            }

        }finally {
            lock.unlock();
        }
    }

    public int getSize() {
        lock.lock();
        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }
}


