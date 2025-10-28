import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimerSolicitarDatosExcepciones {

    public static void main(String[] args) {
        //Inicializando una lista vacia
       // List<String> listaNumeros= new ArrayList<>();


        //Añadiendo datos
        Scanner in= new Scanner(System.in);// lee datos enteros
        Scanner entrada = new Scanner(System.in); //Lee datos string

        System.out.println("Cuantos datos deseas ingresar?");
        try {
        int datos = in.nextInt();
            Integer[] names= new Integer[datos];

            for (int i = 0; i < names.length; i++) {
                System.out.println("Ingresa un numero ");
                names[i] = entrada.nextInt();
            }

            System.out.println("Los datos son:");
            for(int i=0; i<names.length;i++){
                System.out.print(names[i] + " ");
            }

        }  catch (Exception e) {
        System.out.println("Ingresaste una letra o mas");
    }finally{
        System.out.println("Fin del programa");
    }


    } // fin del metodo principal

}// fin de la clase
