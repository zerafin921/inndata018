public class promedio2 {
    public static void main(String [] args){
        String nombre="Manuel";
        int edad=17;
        float cal=5.5f, cal1=6.3f, cal3=5.3f;
        float promedio= (cal+cal1+cal3)/3;
        //edad+=1; //edad=edad+1
        String paso= (promedio>=6.0f)?("Tu promedio es "+ promedio +" , estas Aprobado"):("No aprobado. Tu promedio es "+promedio);
        String mayor= (edad>=18)?"Mayor de edad":"Eres menor";
        System.out.println(paso);
        System.out.println(mayor);
    }
}