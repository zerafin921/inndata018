package ClasesCompuestaEjercicio;

import ClasesCompuesta.AutoDos;
import ClasesCompuesta.Llanta;
import ClasesCompuesta.Motor;
import ClasesCompuesta.Puertas;

public class PrincipalCelular {

    public static void main(String[] args) {
        Botones botones= new Botones(3,"metal","3 chicos");
        Procesador procesador= new Procesador(4, "intel","AD423" );
        Camaras camaras= new Camaras(4, "Espiral","Plateado");
        Celular celular= new Celular("Apple","iphone 17","rojo",botones,camaras,procesador);

        System.out.println("Mi celular tiene "+ celular.getProcesador().getNucleos() + " nucleos");
        System.out.println("Mi celular tiene "+ procesador.getNucleos() + " nucleos");


    }
}
