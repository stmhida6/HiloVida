package sincronizacion;

public class Cuenta {
    private int saldo =100;

    public  void retirarDinero(int cantidad){

        System.out.println(Thread.currentThread().getName() + " esta en zona no sincronizada");
        /*
         *
         *
         */

        synchronized (this) {
        System.out.println(Thread.currentThread().getName() + " saldo antes de validar  " + saldo + ".");
        if(saldo >= cantidad){
            System.out.println(Thread.currentThread().getName() + " esta realizando un retiro de: " + cantidad + ".");
            saldo -= cantidad;
            System.out.println(Thread.currentThread().getName() + " retiro realizado. Saldo actual: " + saldo);


        }else{
            System.out.println("Saldo insuficiente");

        }}
        System.out.println(Thread.currentThread().getName() + " esta zona esta  sincronizada");

        /**
         *
         */
    }

    public int getSaldo(){
        return saldo;
    }

}
