package Herencia;

public class Jefe extends Gerente {
    public String marca;
    public String empresa;




    public Jefe(String nombre, String edad, String sucursal, String horario, String puesto, String obligaciones, String marca, String empresa) {
        super(nombre, edad, sucursal, horario, puesto, obligaciones);
        this.marca = marca;
        this.empresa = empresa;
    }

    public Jefe(){

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
