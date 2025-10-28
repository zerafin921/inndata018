import java.util.Scanner;

public class CalculadoraConMetodos {

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
                    //llamando a la funcion
                    System.out.println(suma(5,8));
                    //Utilizando el metodo
                    CalculadoraConMetodos  micalculadora= new CalculadoraConMetodos ();
                    System.out.println(micalculadora.sumar(80,90));
                    break;
                case 2:
                    System.out.println("Estoy restando");
                    break;
                case 3:
                    System.out.println("Estoy multiplicando");
                    break;
                case 4:
                    System.out.println("Estoy dividiendo");
                    break;
                case 5:
                    System.out.println("Fin del programa.Hasta luego");
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    break;

            }


        }
        //Metodo estatico o funcion
        static double suma(double num1, double num2){
            return num1+num2;
        }
        //Metodo
        public double sumar(double n1, double n2){
            return n1+n2;
        }
}
