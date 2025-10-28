import java.util.Scanner;

public class EcuacionSegundoGrado {

    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double xuno;
        double xdos;
        double b;
        double a;
        double c;
        double resultado;

        System.out.println(" Valor a ");
        a= entrada.nextDouble();
        System.out.println(" Valor b ");
        b= entrada.nextDouble();
        System.out.println(" Valor c");
        c= entrada.nextDouble();
        xuno= (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        xdos= (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
        System.out.println(xuno+" y el otro "+xdos);

    }


}
