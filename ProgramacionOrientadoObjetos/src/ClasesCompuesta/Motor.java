package ClasesCompuesta;

public class Motor {
    private int capacidad;
    private int cilindros;
    private String tipoCombustible;

    public Motor(int capacidad, int cilindros, String tipoCombustible) {
        this.capacidad = capacidad;
        this.cilindros = cilindros;
        this.tipoCombustible = tipoCombustible;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
}