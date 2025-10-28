package ClaseGenericasEjercicio;

public class Articulo1 {
    public int id;
    public String nombre;
    public String codigobarras;
    public double precio;
    public int existencia;


    public Articulo1(int id, String nombre, String codigobarras, double precio, int existencia) {
        this.id = id;
        this.nombre = nombre;
        this.codigobarras = codigobarras;
        this.precio = precio;
        this.existencia = existencia;
    }

    public Articulo1(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(String codigobarras) {
        this.codigobarras = codigobarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
}
