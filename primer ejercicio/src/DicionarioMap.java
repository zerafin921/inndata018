

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DicionarioMap {
        public static void main(String[] args) {

            Map<String, Integer> puntuaciones= new HashMap<>(); //Acomoda sin importar orden alfabetico ni por cual entro primero.

           // Map<String, Integer> puntuaciones= new TreeMap<>(); Acomoda por orden alfabetico ASCII

          //  Map<String, Integer> puntuaciones= new LinkedHashMap<>(); Acomoda por el primero que entra no importa el orden alfabetico el ultimo que entra es el ultimo que sale.

            //Agregando elementos (pares clave-valor)
            puntuaciones.put("Ana",1500);
            puntuaciones.put("Ernesto",2000);
            puntuaciones.put("Carlos",1200);
            System.out.println(puntuaciones);
            puntuaciones.put("Ernesto",3000);
            System.out.println(puntuaciones);
            //Obtener valores
            System.out.println("La puntuación de Ernesto es "+puntuaciones.get("Ernesto"));
            for(String nombre: puntuaciones.keySet()){
                System.out.println(nombre +" -> "+ puntuaciones.get(nombre));
            }
            System.out.println(puntuaciones.remove("Marisol"));
            System.out.println(puntuaciones);


        }
    }


