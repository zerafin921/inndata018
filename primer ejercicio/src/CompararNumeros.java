import java.util.Scanner;

public class CompararNumeros {

public static void main (String[] args)
{
    Scanner entrada = new Scanner(System.in);
    double b;
    double a;
    double c;
    double d;
    double resultado;

    System.out.println(" Valor 1 ");
    a= entrada.nextDouble();
    System.out.println(" Valor 2 ");
    b= entrada.nextDouble();
    System.out.println(" Valor 3");
    c = entrada.nextDouble();
    System.out.println(" Valor 4");
    d= entrada.nextDouble();

    resultado = Math.max(a, Math.max(b, Math.max(c, d)));

    System.out.println("El número mayor es: " + resultado);

/*
    int num1 = 10;
    int num2 = 25;
    int num3 = 15;
    int num4 = 30;

    int mayor = num1; // mayor es 10

    if (num2 > mayor) {
        mayor = num2; // mayor es 25
    }

    if (num3 > mayor) {
        mayor = num3; // mayor sigue siendo 25
    }

    if (num4 > mayor) {
        mayor = num4; // mayor es 30
    }

    System.out.println("El número mayor es: " + mayor);
  */

   /* if(a > b && b> c && c > d) {
        mayor = a;

        System.out.println("Los números que están en el medio son: " + num2 + " y " + num3);
    } else if(num > num2 && num2 < num3 && num3 > num4) {
        mayor = num2;
        menor = num4;
        System.out.println("Los números que están en el medio son: " + num2 + " y " + num4);
    } else if(num < num2 && num2 > num3 && num3 < num4) {
        mayor = num2;
        menor = num4;
        System.out.println("Los números que están en el medio son: " + num + " y " + num4);
    } else if(num2 > num && num > num3 && num3 > num4) {
        mayor = num2;
        menor = num4;
        System.out.println("Los números que están en el medio son: " + num + " y " + num3);
    } else if(num3 > num && num > num2 && num2 > num4) {
        mayor = num3;
        menor = num4;
        System.out.println("Los números que están en el medio son: " + num + " y " + num2);
    } else if(num2 > num && num > num3 && num3 > num4) {
        mayor = num2;
        menor = num4;
        System.out.println("Los números que están en el medio son: " + num2 + " y " + num3);
    }

    */

}



}
