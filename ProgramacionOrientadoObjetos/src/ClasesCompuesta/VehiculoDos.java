package ClasesCompuesta;

public class VehiculoDos {
    private String marca;
    private String modelo;

    public VehiculoDos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

    public void acelerar(){
        System.out.println("Estoy acelerando");
    }

    public void frenar(){
        System.out.println("Estoy frenando");
    }
}