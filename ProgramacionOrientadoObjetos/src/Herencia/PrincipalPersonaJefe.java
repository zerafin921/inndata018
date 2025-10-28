package Herencia;

import java.util.Scanner;

public class PrincipalPersonaJefe {


    public static void main(String[] args){

        Scanner entrada= new Scanner(System.in);
        Scanner entrad= new Scanner(System.in);

        String nombre;
        String edad;

        Jefe dato=new Jefe();
        System.out.println("Ingresa el nombre ");
        nombre=entrada.nextLine();
        System.out.println("Ingresa la edad ");
        edad=entrad.nextLine();

        dato.setNombre(nombre);
        dato.setEdad(edad);


        //Instanciar una clase o crear un objeto


        System.out.println(" se llama: "+dato.getNombre());

        System.out.println("La edad es: "+dato.getEdad());


    }
}
