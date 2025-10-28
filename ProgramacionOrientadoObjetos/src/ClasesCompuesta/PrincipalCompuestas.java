package ClasesCompuesta;

public class PrincipalCompuestas {
    public static void main(String[] args) {
        Motor motor= new Motor(3,4,"gasolina");
        Llanta llanta= new Llanta("Todo terreno", "negras","Caucho" );
        Puertas puertas= new Puertas(4, "Abatible");
        AutoDos carro= new AutoDos("Volkswagen","vwx","rojo",motor,llanta,puertas);

        System.out.println("Mi carro tiene "+ carro.getPuertas().getCantidad() + " puertas");


    }
}