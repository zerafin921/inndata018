import java.util.Scanner;

public class NombreAlturaSalario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salario;
        int altura;
        String salariofinal="";
        String alturafinal="";
        String nombre;
        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println("¿Cual es tu salario?");
        salario = entrada.nextInt();
        System.out.println("¿Cual es tu altura?");
        altura = entrada.nextInt();


        if (altura > 172) {
          alturafinal="eres alto";

        }else{
            if(altura >= 162 && altura <= 172) {
                alturafinal="eres mediano";
            }
            else if(altura < 162){
                alturafinal="eres bajo";
            }
        }



        if (salario >= 20000) {
            salariofinal="ingreso alto";

        }else{
            if(salario >= 8000 && salario <= 20000) {
                salariofinal= "ingreso medio";
            }
            else if(salario < 8000){
                salariofinal= "ingreso bajo";
            }
        }

        System.out.println(nombre+" "+alturafinal);
        System.out.println(nombre+" "+salariofinal);

    }
}
