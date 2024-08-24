package ciclovida;

public class HiloCicloVida extends  Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciando el hilo: " + Thread.currentThread().getName());

            Thread.sleep(5000);
            System.out.println("Finalizado " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            System.out.println("Error en el hilo: " + Thread.currentThread().getName());
        }

    }


}