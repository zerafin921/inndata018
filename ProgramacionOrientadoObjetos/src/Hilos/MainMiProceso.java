package Hilos;

public class MainMiProceso {
    public static void main(String[] args) {
        MiProceso proceso= new MiProceso("Hola");
        MiProceso proceso2= new MiProceso("Adiós");

        System.out.println("El hilo principal sigue trabajando mientras los otros se preparan");

        //Primero se utiliza el metodo start()
        proceso.start(); // inicia la ejecucion cocurrente del hilo y este llama al metodo run
        proceso2.start();


    }
}