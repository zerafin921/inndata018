import java.util.Scanner;

public class ParImparCondicional {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double numero;
        int decision;
       // String pisofinal = "";
       // String nombre;


        do {
            System.out.println("Ingresa un numero para determinar si es par o impar");
            System.out.println("¿Cual numero deseas ingresar?");
            numero = entrada.nextDouble();
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }

            System.out.println("¿Quieres intentarlo de nuevo? Coloca cualquier numero para continuar y 0 para terminar");
            decision = entrada.nextInt();
        } while (decision != 0);
    }
}