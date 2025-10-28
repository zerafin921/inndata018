package ClaseGenericasEjercicio;

import java.util.ArrayList;
import java.util.List;

//Clase generica
public class Bodega <T> {

    //Una lista de objetos
    List<T> lista = new ArrayList<>();

    //metodos
    public void add(T objeto) {
        lista.add(objeto);
    }

    public List<T> getLista() {
        return lista;
    }
}