public class Promedio {

    public static void main (String[] args)
    {
        String nombre="Manuel";
        int edad=24;
        float cal1=9.5f, cal2=8.3f, cal3=5.3f;
        float promedio = (cal1+cal2+cal3)/3;

        if(promedio>=6.0f) {

            System.out.println("tu promedio de " + promedio + ", estas aprobado");
        }else{
                System.out.println("tu promedio de "+promedio+", no esta aprobado");
            }


        if(edad>=18) {
            System.out.println("eres mayor de edad ");
        }else{
                System.out.println("eres menor de edad ");
            }
        }



}
