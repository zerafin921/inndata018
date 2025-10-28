package Polimorfismo;

public class TrianguloEquilatero extends Forma {
    private double altura, base;

    public TrianguloEquilatero(String nombre, double altura, double base) {
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return base*3;
    }
}