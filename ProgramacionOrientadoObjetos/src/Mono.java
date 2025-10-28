public class Mono extends Animal {

    //Atributos
   public String rascarse;
   public String saludar;

    public Mono(String nombre, int edad, String rascarse, String saludar) {
        super(nombre, edad);
        this.rascarse = rascarse;
        this.saludar = saludar;
    }

    public Mono(String rascarse, String saludar) {
        this.rascarse = rascarse;
        this.saludar = saludar;
    }

    public String getRascarse() {
        return rascarse;
    }

    public void setRascarse(String rascarse) {
        this.rascarse = rascarse;
    }

    public String getSaludar() {
        return saludar;
    }

    public void setSaludar(String saludar) {
        this.saludar = saludar;
    }
@Override
    public void correr(){
        System.out.println("Estoy corriendo mucho jaja");

    }
}
