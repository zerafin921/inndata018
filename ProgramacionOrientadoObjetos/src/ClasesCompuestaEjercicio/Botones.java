package ClasesCompuestaEjercicio;

public class Botones {
    private int cantidad;
    private String material;
    private String colores;

    public Botones(int cantidad, String material, String colores) {
        this.cantidad = cantidad;
        this.material = material;
        this.colores = colores;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }
}
