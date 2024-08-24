package ciclovida;

public class HiloInterrupt extends  Thread {

    @Override
    public void run() {
        try {
         for (int i = 1; i <= 5; i++) {
             System.out.println(Thread.currentThread().getName() + " - " + i);
             Thread.sleep(1000);
         }
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo: " + Thread.currentThread().getName());
        }

    }
}
