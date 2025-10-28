import java.util.Scanner;

public class CalculadoraMetodosEstaticos {



        public static void main(String[] args) {
            Scanner entrada= new Scanner(System.in);
            System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Salir
                """);
            int opcion;

            System.out.println("¿Que opción deseas? Ingresa 5 para salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Ingresa el primer numero");
                    double sum1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double sum2 = entrada.nextDouble();
                    //llamando a la funcion suma
                    System.out.println(suma(sum1,sum2));

                    //Utilizando el metodo
                 /*   CalculadoraMetodosEstaticos micalculadora= new CalculadoraMetodosEstaticos();
                    System.out.println(micalculadora.sumar(80,90));
                  */
                    break;
                case 2:
                    System.out.println("Ingresa el primer numero");
                    double rest1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double rest2 = entrada.nextDouble();
                    //llamando a la funcion resta
                    System.out.println(resta(rest1,rest2));
                    break;
                case 3:
                    System.out.println("Ingresa el primer numero");
                    double mult1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero");
                    double mult2 = entrada.nextDouble();
                    //llamando a la funcion multiplicacion
                    System.out.println(multiplicacion(mult1,mult2));
                    break;
                case 4:
                    System.out.println("Ingresa el primer que sera divisor");
                    double div1 = entrada.nextDouble();
                    System.out.println("Ingresa el segundo numero que sera numerador");
                    double div2 = entrada.nextDouble();
                    //llamando a la funcion division
                    System.out.println(division(div1,div2));
                    break;
                case 5:
                    System.out.println("Fin del programa.Hasta luego");
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    break;

            }

        }


        //Metodo estatico o funcion de suma
        static double suma(double num1, double num2){
            return num1+num2;
        }

    //Metodo estatico o funcion de resta
    static double resta(double num1, double num2){
        return num1-num2;
    }

    //Metodo estatico o funcion de multiplicacion
    static double multiplicacion(double num1, double num2){
        return num1*num2;
    }

    //Metodo estatico o funcion de division
    static double division(double num1, double num2){
        return num1/num2;
    }

        /*Metodo
        public double sumar(double n1, double n2){
            return n1+n2;
        }
        */



}



