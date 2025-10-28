import java.util.Scanner;

public class Ahorro {


    public static void main (String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double ahorrodia=0.0;

        double mes;
        double ano;
        double anos;

        System.out.println("Cual es tu ahorro diario?");
        ahorrodia= entrada.nextDouble();
        double porcentaje = ahorrodia * (20.0 / 100.0);

        mes= (ahorrodia*30)+(porcentaje*30);
        ano= (ahorrodia*365)+(porcentaje*365);
        anos= (ahorrodia*3650)+(porcentaje*3650);
        System.out.println("Ahorro mensual: "+mes);
        System.out.println("Ahorro anual: "+ano);
        System.out.println("Ahorro 10 años: "+anos);


    }
}
