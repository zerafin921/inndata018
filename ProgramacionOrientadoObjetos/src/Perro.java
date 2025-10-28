

public class Perro extends Animal{
    //Atributos
    private String color;
    private String raza;
    //Metodo constructor, se le conoce así porque inicializa los atributos de la clase

    public Perro(String nombre, int edad, String color, String raza) {
        super(nombre,edad);
        this.color = color;
        this.raza = raza;
    }

    public Perro() {
    }

    //Getter y Setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //Métodos
    public void ladrar(){
        System.out.println("Guau guau");
    }

    //Metodo heredado sobreescrito


    @Override
    public void comer() {
        System.out.println("El perro esta comiendo croquetas ");
    }

    @Override
    public void dormir() {
        System.out.println("El perro duerme por las noches ");
    }
}
