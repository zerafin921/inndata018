public class Calculadora {
    public void sumar(){
        System.out.println("Estoy sumando");
    }

    public double sumar(double a, double b){
        return a+b;
    }

    public double sumar(double... numeros){
        double suma=0;
        for(double num : numeros){
            suma+=num;
        }
        return suma;
    }

}