package AbstracionInterfaces;

public class Gorila extends Animal{
    private String golpear;

    public Gorila(String nombre, int edad, String golpear) {
        super(nombre, edad);
        this.golpear = golpear;
    }

    public Gorila(String golpear) {
        this.golpear = golpear;
    }

    public String getGolpear() {
        return golpear;
    }

    public void setGolpear(String golpear) {
        this.golpear = golpear;
    }

    public String Comer(){
        return "como mucho pero rapido";
    }

    public String Respirar(){
        return "respiro mucho";
    }
}
