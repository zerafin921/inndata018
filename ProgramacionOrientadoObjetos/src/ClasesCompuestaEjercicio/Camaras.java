package ClasesCompuestaEjercicio;

public class Camaras {
    private int cantidad;
    private String forma;
    private String color;

    public Camaras(int cantidad, String forma, String color) {
        this.cantidad = cantidad;
        this.forma = forma;
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
