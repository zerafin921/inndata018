import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class PrimerEjercicioLambda {

    public static void main(String[] args) {
        List<String> listaDeNombres = new ArrayList<>();
        listaDeNombres.add("Angel");
        listaDeNombres.add("Armando");
        listaDeNombres.add("Raul");
        listaDeNombres.add("Betty");
        listaDeNombres.add("Alma");
        listaDeNombres.add("HuGo");
        listaDeNombres.add("Carolina");

        List<String> listaAlfabeto = listaDeNombres.stream().sorted().toList();
        System.out.println(listaAlfabeto);

        List<String> listaConMayusculas=listaAlfabeto.stream().map(nombre->nombre.toUpperCase()).toList();
        System.out.println(listaConMayusculas);

        List<String> listaConA=listaConMayusculas.stream().filter(name-> name.startsWith("A")).toList();
        System.out.println(listaConA);

    }




}
