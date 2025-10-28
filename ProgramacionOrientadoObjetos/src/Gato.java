public class Gato {

    //Atributos
    private String nombre;
    private int edad;
    private String color;
    private String raza;
    //Metodo constructor, se le conoce así porque inicializa los atributos de la clase
    public Gato(String nombre, int edad, String color, String raza){
        this.nombre= nombre;
        this.edad=edad;
        this.color=color;
        this.raza=raza;
    }
    //Metodo constructor sin argumentos
    public Gato(){

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
    public void maullar(){
        System.out.println("Miau Miau");
    }
    public void comer(){
        System.out.println("Estoy comiendo whiskas");

    }
    public void dormir(){
        System.out.println("Zzzzz");
    }



}
