package ClasesCompuesta;

public class Llanta {
    private String uso;
    private String color;
    private String compuesto;

    public Llanta(String uso, String color, String compuesto) {
        this.uso = uso;
        this.color = color;
        this.compuesto = compuesto;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompuesto() {
        return compuesto;
    }

    public void setCompuesto(String compuesto) {
        this.compuesto = compuesto;
    }
}