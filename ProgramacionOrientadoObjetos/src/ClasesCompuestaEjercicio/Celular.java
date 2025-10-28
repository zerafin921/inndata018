package ClasesCompuestaEjercicio;

public class Celular extends ModeloCelular{

    private String color;
    private Botones botones;
    private Camaras camaras;
    private Procesador procesador;

    public Celular(String marca, String modelo, String color, Botones botones, Camaras camaras, Procesador procesador) {
        super(marca, modelo);
        this.color = color;
        this.botones = botones;
        this.camaras = camaras;
        this.procesador = procesador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Botones getBotones() {
        return botones;
    }

    public void setBotones(Botones botones) {
        this.botones = botones;
    }

    public Camaras getCamaras() {
        return camaras;
    }

    public void setCamaras(Camaras camaras) {
        this.camaras = camaras;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
}
