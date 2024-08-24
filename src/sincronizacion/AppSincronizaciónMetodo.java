package sincronizacion;

public class AppSincronizaciónMetodo {

    public static void  main(String[] args) {
        Cuenta cuenta = new Cuenta();
        Thread hilo1 = new Thread(() ->
            cuenta.retirarDinero(50), "Hilo 0 "
        );
        Thread hilo2 = new Thread(() ->
            cuenta.retirarDinero(50), "Hilo 1 "
        );

        Thread hilo3 = new Thread(() ->
            cuenta.retirarDinero(50), "Hilo 2 "
        );


        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
