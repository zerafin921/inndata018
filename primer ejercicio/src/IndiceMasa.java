import java.util.Scanner;

public class IndiceMasa {

public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double peso;
        double altura;
        double resultado;
    System.out.println("CUAL ES NOMBRE?");
    nombre= entrada.nextLine();
        System.out.println("CUAL ES TU PESO?");
    peso= entrada.nextDouble();
    System.out.println("CUAL ES TU ALTURA EN METROS?");
    altura= entrada.nextDouble();
    resultado= peso/(altura*altura);
    System.out.println(nombre+" tu indice de masa corporal es "+resultado);

    }
}
