import java.util.Scanner;

public class ElevadorHospital {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int piso;
        String pisofinal="";
    /*    String piso1="";
        String piso2="";
        String piso3="";
        String piso4="";
        String piso5="";*/
        String nombre;
        System.out.println("¿Cual es tu nombre?");
        nombre = entrada.nextLine();
        System.out.println(nombre+", ¿a cual piso deseas ir?");
        piso = entrada.nextInt();



        if (piso >= 1 && piso<=5) {


            if(piso== 1) {
                pisofinal="estas en el piso alta mar";
            }
            else if(piso==2){
                pisofinal="estas en el piso malecon";
            }

             else if(piso==3){
                pisofinal="estas en el piso marimar";
            }

             else if(piso==4){
                pisofinal="estas en el piso coromuel";
            }

             else if(piso==5){
                pisofinal="estas en el piso bahia";
            }



        }else{
            pisofinal=" ese piso no existe";
        }





        System.out.println(nombre+" "+pisofinal);


    }


}
