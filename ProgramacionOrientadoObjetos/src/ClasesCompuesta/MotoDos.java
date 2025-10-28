package ClasesCompuesta;

import Herencia.Vehiculo;

public class MotoDos extends VehiculoDos {
    private int noLlantas;

    public MotoDos(String marca, String modelo, int noLlantas) {
        super(marca,modelo);
        this.noLlantas = noLlantas;
    }

    public int getNoLlantas() {
        return noLlantas;
    }

    public void setNoLlantas(int noLlantas) {
        this.noLlantas = noLlantas;
    }
}