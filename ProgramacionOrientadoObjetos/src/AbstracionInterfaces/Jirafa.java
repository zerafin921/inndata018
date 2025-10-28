package AbstracionInterfaces;

public class Jirafa extends Animal{
    private String moverse;

    public Jirafa(String nombre, int edad, String moverse) {
        super(nombre, edad);
        this.moverse = moverse;
    }

    public Jirafa(String moverse) {
        this.moverse = moverse;
    }

    public Jirafa() {
    }

    public String getMoverse() {
        return moverse;
    }

    public void setMoverse(String moverse) {
        this.moverse = moverse;
    }

    public String Comer(){
        return "como mucho pero despacio";
    }

    public String Respirar(){
        return "respiro mucho";
    }
}
