import java.util.Scanner;

public class PromedioEdad3 {



    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
        String nombre;
        int edad;
        float cal;
        String decision;
        do {
            double suma=0, promedio;
            System.out.println("Ingresa un nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingresa tu edad");
            edad = entrada.nextInt();

            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresa tu calificación " + (i + 1));
                cal = entrada.nextFloat();
                suma += cal;
            }
            promedio = suma / 3;
            //edad+=1; //edad=edad+1
            String paso = (promedio >= 6.0f) ? ("Tu promedio es " + promedio + " , estas Aprobado") : ("No aprobado. Tu promedio es " + promedio);
            String mayor = (edad >= 18) ? "Mayor de edad" : "Eres menor";
            System.out.println(paso);
            System.out.println(mayor);
            entrada.nextLine();
            System.out.println("¿Quieres intentarlo de nuevo? Coloca S para si y N para no");
            decision = entrada.nextLine();
        }while(!decision.equals("N"));

    }

    }



