package Herencia;

public class Trabajador extends Persona {
    public String sucursal;
    public String horario;

    public Trabajador(String nombre, String edad, String sucursal, String horario) {
        super(nombre, edad);
        this.sucursal = sucursal;
        this.horario = horario;
    }
public Trabajador(){
}
    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
