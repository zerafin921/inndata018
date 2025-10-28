package Interfaces;

public class GatoDos implements PuedeCaminar, Terrestre {
    private String nombre;
    private int edad;

    public GatoDos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void caminar() {
        System.out.println("El gato camina ronroneando");
    }

    @Override
    public double velocidadDeCaminata() {
        return 0.5; //m/s
    }

    @Override
    public void correr() {
        System.out.println("El gato corre moviendo la cola");
    }
}