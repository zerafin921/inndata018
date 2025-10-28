import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class EjercicioFinalModulo1 {

    public static void main (String[] args){

        List<Float> listaDeNumeros = new ArrayList<>();
        Scanner in= new Scanner(System.in);// lee datos enteros
        Scanner entrada= new Scanner(System.in);// lee datos enteros
        float nuevoDato;



        System.out.println("Cuantos numeros deseas ingresar:");
        try {
        int datoss = in.nextInt();
        for (int i = 0; i < datoss; i++) {
            System.out.println("Ingresa el dato "+(i+1)+":");
            nuevoDato = entrada.nextFloat();

            if (nuevoDato>=10) {
                listaDeNumeros.add(nuevoDato);
            } else {
               List<Float> lista = new ArrayList<>();
                lista.add(nuevoDato);
            }

        }


/*
        float product = listaDeNumeros.stream()
                .reduce(1.0f, (a, b) -> * 2);

         Optional<Float> product= listaDeNumeros.stream().reduce((numero, suma)->suma+=(numero*2));
*/

      float product= listaDeNumeros.stream().mapToInt(Float::intValue).sum()*2;
      System.out.println("El resultado de todos los numeros multiplicado por 2, es: "+product);


        }  catch (Exception e) {
            System.out.println("Ingresaste una letra o mas, favor de ingresar solo numeros");
        }finally{
            System.out.println("Fin del programa");
        }



    }


}
