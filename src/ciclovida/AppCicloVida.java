package ciclovida;

public class AppCicloVida {

    public static void main(String[] args) throws InterruptedException {
      /*  HiloCicloVida hilo1 = new HiloCicloVida();
        HiloCicloVida hilo2 = new HiloCicloVida();
        HiloCicloVida hilo3 = new HiloCicloVida();

        hilo1.start();
        hilo2.start();
        hilo3.start();*/

      /*  HiloJoin hilo0 = new HiloJoin();
        HiloJoin hilo1 = new HiloJoin();
        HiloJoin hilo2 = new HiloJoin();

        hilo0.start();
        hilo2.start();
        try {
            hilo0.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hilo1.start();*/

        HiloInterrupt hilo1 = new HiloInterrupt();

        try {
            hilo1.start();
            Thread.sleep(1000);
            hilo1.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

}