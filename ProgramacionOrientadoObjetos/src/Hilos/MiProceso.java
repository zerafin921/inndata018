package Hilos;

public class MiProceso extends Thread{
    private String nombre;

    public MiProceso(String nombre){
        this.nombre=nombre;
        System.out.println("Hilo: "+ this.nombre + " creado");
    }


    //run es donde va la logica de la tarea que el hilo va a hacer, No lo llamemos directamente.
    @Override
    public void run() {
        System.out.println("Hilo "+ nombre+ " se esta ejecutando ");

        //Colocar una tarea
        for(int i=0;i<5;i++){
            System.out.println(nombre+ " Contador= "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("El hilo "+ nombre+ " ha terminado su ejecución");
        }
    }
}