import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        //Instanciar una clase o crear un objeto
        Perro miPerro=new Perro("Polvoron",3,"blanco","mestizo");
        System.out.println(miPerro.getNombre());
        miPerro.comer();
        miPerro.dormir();
        Perro perro=new Perro();
        System.out.println(perro.getNombre());
        Scanner entrada= new Scanner(System.in);
        Calculadora calculadora=new Calculadora();
        System.out.println(calculadora.sumar(5,7,8,9,10,100));
        calculadora.sumar(5,7);



        String nombre;
        System.out.println("Ingresa el nombre para el mono ");
        nombre=entrada.nextLine();

        Mono mono=new Mono("mucho","hola");
        System.out.println("El mono se esta rascando: "+mono.getRascarse());
        mono.correr();

        mono.setNombre(nombre);
        System.out.println(" se llama: "+mono.getNombre());





    }


}