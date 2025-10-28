package AbstracionInterfaces;

public abstract class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Animal() {
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

    public void correr(){
        System.out.println("Estoy corriendo");

    }


    public void comer(){
        System.out.println("Estoy comiendo");

    }
    public void dormir(){
        System.out.println("Zzzzz");
    }

    public abstract String Comer();
    public abstract String Respirar();
}