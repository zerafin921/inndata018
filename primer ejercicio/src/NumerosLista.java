import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumerosLista {

    public static void main(String[] args) {
        //Inicializando una lista vacia
       // NumerosLista <Double> listaNombres = new ArrayList<>();
        List<Double> listaNumeros = new ArrayList<>();

        System.out.println("Cuanto datos deseas ingresar?");
        Scanner entrada = new Scanner(System.in);
        int datos = entrada.nextInt();

        for(int i=0; i<datos;i++) {
            System.out.println("Dato " + (i + 1));
            double numeros = entrada.nextDouble();
            listaNumeros.add(numeros);
        }

        System.out.println("Los numeros ingresados son: ");
        for (double nombre : listaNumeros) {
            System.out.print(" ");
            System.out.print(nombre);
        }

       double sumafinal=0;
        for(double sumar:listaNumeros){
            sumafinal+=sumar;
        }

       double promedio=0;
        for(double prome:listaNumeros){
            promedio=(sumafinal/datos);
        }


        double numeroMayor = Collections.max(listaNumeros);
        double numeroMenor = Collections.min(listaNumeros);



      /*  double numeroMenor=0;
        for(double funcioncuatro:listaNumeros){
            numeroMenor = Collections.min(funcioncuatro);

        }*/
        System.out.println("");
        System.out.println("La suma es: "+sumafinal);
        System.out.println("El promedio es: "+promedio);
        System.out.println("El mayor numero es:"+numeroMayor);
        System.out.println("El numero menor es: "+numeroMenor);

/*
        for(Double numdos:listaNumeros){
            double suma+=numdos;
            System.out.println(suma);
        }

        for(Double numtres:listaNumeros){
            Double numeroMayor = Collections.max(numtres);
            System.out.println(numeroMayor);
        }

        for(Double numcuatro:listaNumeros){
            Double numeroMenor = Collections.min(numcuatro);
            System.out.println(numeroMenor);
        }
       */

 /*       listaNombres.add("Marisela");//0
        listaNombres.add("Ana");//1
        listaNombres.add("Esther");//2
        System.out.println(listaNombres);
        listaNombres.add(1, "Oscar"); //[Marisela, Oscar,Esther] [Marisela, Oscar,Ana,Esther]
        listaNombres.add("Angel");
        System.out.println(listaNombres);//[Marisela, Oscar, Ana, Esther, Angel]
        if (listaNombres.contains("Marisol")) {
            System.out.println("Marisol esta en la lista");
        } else {
            System.out.println("Marisol no esta en la lista");
        }
        System.out.println(listaNombres.get(1));
        listaNombres.set(0, "Mario");
        System.out.println(listaNombres);

        for (String n : listaNombres) {
            System.out.println(n);
        }
*/

    }

}
