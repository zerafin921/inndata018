import java.util.Scanner;

public class TresProgramasEnUno {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;
        double numero;
        String pisofinal="";
        String nombre;
        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println(nombre+" ¿CUAL OPCION REQUIERES:\n 1.- SABER SI UN NUMERO ES PAR O IMPAR\n 2.- SABER SABER EL MAYOR DE 4 NUMEROS\n 3.- CALCULAR INDICE MASA CORPORAL");
        opcion = entrada.nextInt();

        if (opcion >= 1 && opcion<=3)
        {
            if(opcion== 1) {
                System.out.println("¿Cual numero deseas ingresar?");
                numero = entrada.nextDouble();
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es par.");
                } else {
                    System.out.println("El número " + numero + " es impar.");
                }
            }
            else if(opcion==2){
                System.out.println(" Valor 1 ");
                double a= entrada.nextDouble();
                System.out.println(" Valor 2 ");
               double b= entrada.nextDouble();
                System.out.println(" Valor 3");
                double c = entrada.nextDouble();
                System.out.println(" Valor 4");
               double d= entrada.nextDouble();

               double resultado = Math.max(a, Math.max(b, Math.max(c, d)));

                System.out.println("El número mayor es: " + resultado);
            }

            else if(opcion==3){

                double peso;
                double altura;
                double resultado;
                System.out.println("CUAL ES TU PESO?");
                peso= entrada.nextDouble();
                System.out.println("CUAL ES TU ALTURA EN METROS?");
                altura= entrada.nextDouble();
                resultado= peso/(altura*altura);
                System.out.println(nombre+" tu indice de masa corporal es "+resultado);
            }

        }else{
            System.out.println("Esa opcion no existe, ingresa una correcta");
        }






    }
}
