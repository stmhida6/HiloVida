package operacionesatomicas;

import java.lang.management.ThreadInfo;
import java.util.concurrent.atomic.AtomicInteger;

public class OperacionAtomica {

   // private static AtomicInteger contador = new AtomicInteger(0);
    private static int contador = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
           // ThreadInfo hilos = new ThreadInfo(() ->  contador.incrementAndGet());
            Thread hilo = new Thread(() ->  contador++);

            hilo.start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("El contador es: " + contador);
    }

}
