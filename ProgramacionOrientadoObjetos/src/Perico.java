public class Perico extends Animal {

    public String cantar;
    public String chiflar;

    public Perico(String nombre, int edad, String cantar, String chiflar) {
        super(nombre, edad);
        this.cantar = cantar;
        this.chiflar = chiflar;
    }

    public Perico(String cantar, String chiflar) {
        this.cantar = cantar;
        this.chiflar = chiflar;
    }

    public String getCantar() {
        return cantar;
    }

    public void setCantar(String cantar) {
        this.cantar = cantar;
    }

    public String getChiflar() {
        return chiflar;
    }

    public void setChiflar(String chiflar) {
        this.chiflar = chiflar;
    }
    @Override
    public void correr(){
        System.out.println("Estoy corriendo despacio");

    }
}
