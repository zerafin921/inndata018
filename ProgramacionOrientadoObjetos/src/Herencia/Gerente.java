package Herencia;

public class Gerente extends Trabajador {
    public String puesto;
    public String obligaciones;

    public Gerente(String nombre, String edad, String sucursal, String horario, String puesto, String obligaciones) {
        super(nombre, edad, sucursal, horario);
        this.puesto = puesto;
        this.obligaciones = obligaciones;
    }
public Gerente(){
}
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getObligaciones() {
        return obligaciones;
    }

    public void setObligaciones(String obligaciones) {
        this.obligaciones = obligaciones;
    }
}
