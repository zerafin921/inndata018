import java.util.Scanner;
public class NombresArreglos {




        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            String[] names= new String[5];
            for(int i=0;i< names.length;i++){
                System.out.println("Ingresa un nombre " );
                names[i]= in.nextLine();
            }
            for(int i=0; i<names.length;i++){
                System.out.print(names[i] + " ");
            }//[ben, ale, ana]
        }

}
