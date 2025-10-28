package Polimorfismo;

public class MainFiguras {

    public static void main(String[] args) {
        TrianguloEquilatero te= new TrianguloEquilatero("triangulo",5,3);
        System.out.println(te.calcularArea());
        System.out.println(te.calcularPerimetro());
    }

}
