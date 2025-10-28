import java.util.Scanner;
public class PrincipalGato {

    public static void main(String[] args){

        Scanner entrada= new Scanner(System.in);
        Scanner entrad= new Scanner(System.in);

        String nombre;
         int edad;
        String color;
         String raza;

        System.out.println("Ingresa el nombre ");
        nombre=entrada.nextLine();
        System.out.println("Ingresa la edad ");
        edad=entrad.nextInt();
        System.out.println("Ingresa el color ");
        color=entrada.nextLine();
        System.out.println("Ingresa la raza ");
        raza=entrada.nextLine();


        //Instanciar una clase o crear un objeto
        Gato miGato=new Gato(nombre,edad,color,raza);
        miGato.maullar();
        System.out.println("El gato se llama: "+miGato.getNombre());
        System.out.println("El color es:"+miGato.getColor());
        System.out.println("La edad es: "+miGato.getEdad());
        System.out.println("La raza es: "+miGato.getRaza());
        miGato.comer();


    }

}
