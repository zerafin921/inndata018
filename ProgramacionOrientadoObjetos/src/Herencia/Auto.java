package Herencia;

public class Auto extends Vehiculo {
    private String color;

    public Auto(String marca, String modelo, String color) {
        super(marca, modelo);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}