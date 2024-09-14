package productorconsumidor;

public class Buffer {

    int[] buffer;
    private int contador = 0;
    private int tamanio;

    public Buffer(int tamanio) {
        this.tamanio = tamanio;
        buffer = new int[tamanio];
    }

    public synchronized void producir(int item) throws InterruptedException {
        while (contador == tamanio) {
            wait();
        }
        buffer[contador] = item;
        contador++;
        System.out.println("Produciendo " + item);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {

        while (contador == 0) {
            wait();
        }
        contador--;
        int item = buffer[contador];
        System.out.println("Consumiendo " + item);
        notifyAll();
        return item;
    }

}
