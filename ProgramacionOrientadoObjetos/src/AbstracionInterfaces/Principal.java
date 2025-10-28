package AbstracionInterfaces;

public class Principal {

    public static void main(String[] args) {
        Jirafa jirafa= new Jirafa();
        jirafa.setNombre("mamba");
        System.out.println("La jirafa se llama: "+jirafa.getNombre());
        System.out.println(jirafa.Comer());
        System.out.println(jirafa.Respirar());

    }
}
