package Herencia;

public class Moto extends Vehiculo {
    private int noLlantas;

    public Moto(String marca, String modelo, int noLlantas) {
        super(marca,modelo);
        this.noLlantas = noLlantas;
    }

    public int getNoLlantas() {
        return noLlantas;
    }

    public void setNoLlantas(int noLlantas) {
        this.noLlantas = noLlantas;
    }
}