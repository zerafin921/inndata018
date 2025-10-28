package ClasesCompuestaEjercicio;

public class Procesador {
    private int nucleos;
    private String marca;
    private String modelo;


    public Procesador(int nucleos, String marca, String modelo) {
        this.nucleos = nucleos;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
