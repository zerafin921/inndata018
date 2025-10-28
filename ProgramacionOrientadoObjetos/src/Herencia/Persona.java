package Herencia;

public class Persona {


    public String nombre;
    public String edad;

    public Persona(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
public Persona(){
}
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
