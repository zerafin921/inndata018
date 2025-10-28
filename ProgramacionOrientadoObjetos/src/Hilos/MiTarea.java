package Hilos;

public class MiTarea implements Runnable{

    private String nombre;

    public MiTarea(String nombre) {
        this.nombre = nombre;
        System.out.println("Tarea "+this.nombre+ " preparada");
    }

    @Override
    public void run() {
        System.out.println("Hilo "+ nombre+ " se esta ejecutando ");

        //Colocar una tarea
        for(int i=0;i<5;i++){
            System.out.println(nombre+ " Contador= "+i);
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("El hilo "+ nombre+ " ha terminado su ejecución");
        }
    }
}