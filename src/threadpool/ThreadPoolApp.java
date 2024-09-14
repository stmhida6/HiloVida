package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolApp {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 1; i <= 10; i++) {
            Tarea tarea = new Tarea("Tarea " + i);
            executorService.execute(tarea);
        }
        executorService.shutdown();
    }

}
