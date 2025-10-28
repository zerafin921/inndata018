import java.util.*;

public class FilaBancoQueues {

    public static void main(String[] args) {

        //Inicializando una lista vacia
        // NumerosLista <Double> listaNombres = new ArrayList<>();
        Queue <String> listaNumeros = new LinkedList<>();

        System.out.println("Cuanto datos deseas ingresar?");
        Scanner entrada = new Scanner(System.in);
        Scanner entradados = new Scanner(System.in);
        int datos = entrada.nextInt();



       for(int i=0; i<datos;i++) {
            System.out.println("Dato " + (i + 1));
            String numeros = entradados.nextLine();
            listaNumeros.add(numeros);
        }




        System.out.println("Los datos ingresados son: ");
        for(int j=0; j<datos;j++) {
            System.out.print(" ");
            System.out.println(listaNumeros.poll());   //  System.out.print(nombre);
        }




      /*
        Queue<Integer> fila = new PriorityQueue<>();
        fila.add(50);
        fila.offer(55);
        fila.add(60);
        fila.offer(25);
        System.out.println(fila);//[50,55,60,25]
        System.out.println("Estas por ser atendido"+fila.peek());//[50]
        fila.remove();
        System.out.println(fila); //[55,60,25]
        fila.remove();
        System.out.println(fila); //[60,25]
        fila.remove();
        System.out.println(fila); //[25]
        fila.remove();
        System.out.println(fila); //[]
        System.out.println(fila.peek());
        System.out.println(fila.poll());*/
    }
}
