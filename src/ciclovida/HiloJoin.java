package ciclovida;

public class HiloJoin extends  Thread {

    @Override
    public void run() {
      for (int i = 1; i <= 5; i++) {
          System.out.println(Thread.currentThread().getName() + " - " + i);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }


}
