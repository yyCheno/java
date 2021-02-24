package MyTheadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
@Slf4j
public class ThreadPool {
    //线程集合
    private Set<Worker> workers = new HashSet<Worker>();
    //任务队列
    private BlockingQueue<Runnable> taskQueue;
    //线程池核心数
    private int coreSize;
    //超时时间
    private long timeout;
    private TimeUnit unit;
    //使用策略模式
    private RejectPolicy<Runnable> rejectPolicy;

    public ThreadPool(int coreSize, long timeout, TimeUnit unit,int queueCapacity, RejectPolicy<Runnable> rejectPolicy) {
        this.coreSize = coreSize;
        this.timeout = timeout;
        this.unit = unit;
        taskQueue = new BlockingQueue<>(queueCapacity);
        this.rejectPolicy = rejectPolicy;
    }
    //执行任务
    public void executor(Runnable task){
        //如果线程池满就放在任务队列
        synchronized (workers) {
            if(workers.size()<coreSize){
                Worker worker = new Worker(task);
                log.info("新增 worker {} ，任务 {}", worker, task);
                workers.add(worker);
                worker.start();
            }else{
                taskQueue.tryPut(rejectPolicy,task);
            }
        }
    }
    class Worker extends Thread{
        private Runnable task;
        public Worker(Runnable task) {
            this.task=task;
        }

        @Override
        public void run() {
            while (task!=null||(task=taskQueue.poll(timeout,unit))!=null){
                try {
                    log.info("正在执行 {}", task);
                    task.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    task=null;
                }
            }
            synchronized (workers){
                log.info("worker 被移除 {}", this);
                workers.remove(this);
            }
        }
    }
}
