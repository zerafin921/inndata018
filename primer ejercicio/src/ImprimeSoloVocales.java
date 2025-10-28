import java.util.Scanner;

public class ImprimeSoloVocales {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra o oracion: ");
        String[] palabras= new String[1];
       palabras[0] = scanner.nextLine(); // Leer la palabra del usuario
        String palabra = palabras[0];

        String vocales = "aeiouAEIOU"; // Definir todas las vocales
        String vocalesEncontradas = ""; // String para almacenar las vocales encontradas

        // Recorrer cada carácter de la palabra ingresada
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i); // Obtener el carácter actual

            // Verificar si el carácter está en la cadena de vocales
            if (vocales.indexOf(caracter) != -1) {
                vocalesEncontradas += caracter; // Agregar la vocal a la cadena de resultado
            }
        }

        System.out.println("Las vocales son: " + vocalesEncontradas); // Imprimir solo las vocales
        scanner.close(); // Cerrar el scanner
    }
}

