package ClasesCompuesta;

public class AutoDos extends VehiculoDos{
    private String color;
    private Motor motor;
    private Llanta llantas;
    private Puertas puertas;

    public AutoDos(String marca, String modelo, String color, Motor motor, Llanta llantas, Puertas puertas) {
        super(marca, modelo);
        this.color = color;
        this.motor= motor;
        this.llantas= llantas;
        this.puertas= puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Llanta getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta llantas) {
        this.llantas = llantas;
    }

    public Puertas getPuertas() {
        return puertas;
    }

    public void setPuertas(Puertas puertas) {
        this.puertas = puertas;
    }
}