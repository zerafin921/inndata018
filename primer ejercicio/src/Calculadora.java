import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. Division
                5. Salir
                """);
        int opcion=0;
        while(opcion != 5) {
            System.out.println("¿Que opción deseas? Ingresa 5 para salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Estoy sumando");
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

    }
}