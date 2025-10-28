package ClasesGenericas;

public class MainGenericas {
    public static void main(String[] args) {
        Caja<Juguete> cajaDeJuguetes = new Caja<>();
        Juguete juguete= new Juguete("ana", "muñeca");
        cajaDeJuguetes.add(juguete);
        cajaDeJuguetes.add(new Juguete("soldado","muñeco"));
        System.out.println(cajaDeJuguetes.getLista().stream().map(
                x-> "Nombre: "+x.getNombre() +" \n Tipo: "+ x.getTipo()
        ).toList());
    }
}