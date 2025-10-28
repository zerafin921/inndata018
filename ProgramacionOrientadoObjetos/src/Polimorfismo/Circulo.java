package Polimorfismo;

public class Circulo extends Forma {
    private double radio;
    private double pi=3.14;

    public Circulo(String nombre, double radio, double pi) {
        super(nombre);
        this.radio = radio;
        this.pi = pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double calcularArea() {
        return pi*(radio*radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2*pi*radio;
    }
}