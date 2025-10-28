import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CojuntosListaJugadores {

    public static void main(String[] args) {
        Set<String> Jugadores = new TreeSet<>();

        Scanner entrada = new Scanner(System.in);
        int numeros =11;
        String jugadoress;
        String nombreBuscado = "neymar jr";
        boolean encontrado = false;
       // System.out.println("Ingresa cuantos numeros quieres!");
     //   numeros = entrada.nextInt();

        for(int i = 0;i<numeros;i++){
            System.out.println("Ingresa el jugador " + (i + 1));
            jugadoress = entrada.nextLine();
            Jugadores.add(jugadoress);
        }


        for(String j:Jugadores){
            System.out.println(j);

        }



        for (String nombre : Jugadores) {
            if (nombre.equals(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("¡El nombre está en la lista!");
        } else {
            System.out.println("El nombre no está en la lista.");
        }





      /*  curp.add("SACM870925");
        curp.add("SACM870925");
        curp.add("SACM870926");
        curp.add("SACM870902");
        System.out.println(curp);
        curp.remove("SACM870925");
        System.out.println(curp);
        curp.add("sacm870925");
        System.out.println(curp);
*/
    }

}
