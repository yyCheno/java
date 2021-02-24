package MyTheadPool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;
@Slf4j
public class test {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(1,1000, TimeUnit.MILLISECONDS,1,((queue, task) -> {
            task.run();
        }));
        for (int i=0;i<4;i++){
            int j = i;
            threadPool.executor(()->{
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                log.info("{}", j);
            });
        }
    }
}
