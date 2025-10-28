public class Pavo extends Animal {

    public String sacudirse;
    public String cacaraquear;


    public Pavo(String nombre, int edad, String sacudirse, String cacaraquear) {
        super(nombre, edad);
        this.sacudirse = sacudirse;
        this.cacaraquear = cacaraquear;
    }

    public Pavo(String sacudirse, String cacaraquear) {
        this.sacudirse = sacudirse;
        this.cacaraquear = cacaraquear;
    }

    public String getSacudirse() {
        return sacudirse;
    }

    public void setSacudirse(String sacudirse) {
        this.sacudirse = sacudirse;
    }

    public String getCacaraquear() {
        return cacaraquear;
    }

    public void setCacaraquear(String cacaraquear) {
        this.cacaraquear = cacaraquear;
    }

    @Override
    public void correr(){
        System.out.println("Estoy corriendo del humano");

    }
}
