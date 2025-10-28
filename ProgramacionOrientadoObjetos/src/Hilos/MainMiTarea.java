package Hilos;

public class MainMiTarea {

    public static void main(String[] args) {
        /*MiProceso proceso= new MiProceso("Hola");
        MiProceso proceso2= new MiProceso("Adiós");

        System.out.println("El hilo principal sigue trabajando mientras los otros se preparan");

        //Primero se utiliza el metodo start()
        proceso.start(); //start() inicia la ejecucion concurrente del hilo y este llama al metodo run()
        proceso2.start();*/

        //--Con runnable crear las instancias de la tarea
        MiTarea m1= new MiTarea("Alpha");
        MiTarea m2= new MiTarea("Beta");

        //Crear objetos Thread y colocando las tareas como argumentos en cada hilo
        Thread hilo1= new Thread(m1);
        Thread hilo2= new Thread(m2);

        System.out.println(" El hilo principal esta iniciando los hilos de las tareas... ");

        //Iniciandos las ejecuciones
        hilo1.start();
        hilo2.start();
    }

}
