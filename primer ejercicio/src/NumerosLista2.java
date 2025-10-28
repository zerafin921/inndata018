import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class NumerosLista2 {


    public static void main(String[] args) {
        // 1. Crear el Scanner y el ArrayList
        Scanner scanner = new Scanner(System.in);
       // List <Double> listaNumeros = new ArrayList<>();
        List <Double> listaNumeros = new ArrayList<>();

        System.out.println("Ingresa nombres (escribe '001' para terminar):");

        // 2. Leer entradas hasta que el usuario escriba 'salir'
        Double entrada;
        while (true) {
            entrada = scanner.nextDouble();
            if (entrada.equals("001")) {
                break; // Salir del bucle si se escribe 'salir'
            }
            // 3. Agregar la entrada al ArrayList
            listaNumeros.add(entrada);
        }

        // 4. Imprimir los elementos del ArrayList
        System.out.println("Los numeros ingresados son:");
        for (double nombre : listaNumeros) {
            System.out.println(nombre);
        }
/*
        for(double numuno:listaNumeros){
            double sumafinal+=numuno;
            System.out.println(sumafinal);
        }

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
        // 5. Cerrar el Scanner
        scanner.close();
    }
}
