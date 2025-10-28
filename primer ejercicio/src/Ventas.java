import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int ventas;
        System.out.println("¿Cuántas ventas realizaste?");
        ventas= entrada.nextInt();
        if(ventas>=0){
            //if en cascada
            if(ventas<20){
                System.out.println("Ventas bajas");
            }else if(ventas>=20 && ventas<=40){
                System.out.println("Ventas medias");
            }else {
                System.out.println("Ventas altas");
            }
        }else{
            System.out.println("no hay ventas negativas");
        }

    }
}