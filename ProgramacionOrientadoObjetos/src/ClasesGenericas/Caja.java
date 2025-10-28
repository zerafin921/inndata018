package ClasesGenericas;

import java.util.ArrayList;
import java.util.List;

//Clase generica
public class Caja <T> {

    //Una lista de objetos
    List<T> lista = new ArrayList<>();

    //metodos
    public void add(T objeto){
        lista.add(objeto);
    }

    public List<T> getLista(){
        return lista;
    }


}