import java.util.*;

public class MapNombreCorreoSexoEdad {

    public static void main(String[] args) {

       // Map<String, String> puntuaciones= new HashMap<>(); //Acomoda sin importar orden alfabetico ni por cual entro primero.
    Map<String, ArrayList<String>> datos = new HashMap<>();


        String nombres = "Maria";

        String nuevoDato = "";

        Scanner in= new Scanner(System.in);// lee datos enteros
        Scanner entrada= new Scanner(System.in);// lee datos enteros






        System.out.println("Cuantos datos deseas ingresar del usuario");
        int datoss = in.nextInt();
        for (int i = 0; i < datoss; i++) {
            System.out.println("Ingresa un dato: ");
            nuevoDato = entrada.nextLine();

            if (datos.containsKey(nombres)) {
                datos.get(nombres).add(nuevoDato);
            } else {
                ArrayList<String> lista = new ArrayList<>();
                lista.add(nuevoDato);
                datos.put(nombres, lista);
            }

        }

   /*
// Obtiene la lista existente o crea una nueva si la clave no existe
        ArrayList<String> listaDeDatos = datos.computeIfAbsent(nombres, k -> new ArrayList<>());
        listaDeDatos.add(nuevoDato);

// También se puede hacer de forma más manual
        if (datos.containsKey(nombres)) {
            datos.get(nombres).add(nuevoDato);
        } else {
            ArrayList<String> lista = new ArrayList<>();
            lista.add(nuevoDato);
            datos.put(nombres, lista);
        }
*/
        System.out.println(datos);
        //Obtener valores
      //  System.out.println("Los datos de "+datos.get("Maria"));


        for(String nombre: datos.keySet()){
            System.out.println(nombre +" -> "+ datos.get(nombre));
        }
     //   System.out.println(puntuaciones.remove("Marisol"));
   //     System.out.println(puntuaciones);

    }


}
