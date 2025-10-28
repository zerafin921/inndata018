import java.util.Scanner;

public class TiendaAbarrotes {
    public static void main(String[] args) {
        double precio;
        Scanner in= new Scanner(System.in);
        double suma=0;
        String nombre;
        System.out.println("Cual es tu nombre?");
        nombre= in.nextLine();
        for(int i=0; i<3;i++){
            System.out.println("Ingresa el precio del producto "+ (i+1));
            precio= in.nextDouble();
            suma+=precio;
        }
        System.out.println("El precio a pagar es "+suma);
    }
}