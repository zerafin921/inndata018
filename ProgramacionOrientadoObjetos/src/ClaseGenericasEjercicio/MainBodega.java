package ClaseGenericasEjercicio;

import ClasesGenericas.Caja;
import ClasesGenericas.Juguete;

import java.util.Scanner;

public class MainBodega {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Scanner entradados= new Scanner(System.in);
         int id;
         String nombre;
         String codigobarras;
         double precio;
         int existencia;

        System.out.println("""
                1. Agregar nuevo articulo
                2. Editar un articulo
                3. Buscar un articulo por codigo barras
                4. Eliminar un articulo
                5. Buscar articulo por nombre
                6. Mostrar articulos disponibles
                7. Buscar por Id
                9. Salir
                """);
        int opcion;
        do{
            System.out.println("¿Que opción deseas? Ingresa 9 para salir");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar nuevo articulo");
                    Bodega<Articulo1> bodegadearticulos = new Bodega<>();

                    System.out.println("Ingresa id");
                    id = entrada.nextInt();
                    System.out.println("Ingresa el nombre");
                    nombre= entradados.nextLine();
                    System.out.println("Ingresa el codigo de barras");
                    codigobarras= entradados.nextLine();
                    System.out.println("Ingresa el precio");
                    precio= entrada.nextDouble();
                    System.out.println("Ingresa las existencias");
                    existencia= entrada.nextInt();

                    bodegadearticulos.add(new Articulo1(id,nombre,codigobarras,precio,existencia));

                    Articulo1 articulo1= new Articulo1(1, "muñeca", "aoc3q3ijdq",15.0,3);
                    bodegadearticulos.add(articulo1);

                    System.out.println(bodegadearticulos.getLista().stream().map(
                            x-> "ID: "+x.getId() +" \n Nombre: "+ x.getNombre() +" \n Codigo: "+ x.getCodigobarras()+" \n Precio: "+ x.getPrecio()+" \n Existencias: "+ x.getExistencia()+ "\n\n"
                    ).toList());


                    break;
                case 2:
                    System.out.println("Editar un articulo");
                    break;
                case 3:
                    System.out.println("Buscar un articulo por codigo barras");
                    break;
                case 4:
                    System.out.println("Eliminar un articulo");
                    break;
                case 5:
                    System.out.println("Buscar articulo por nombre");
                    break;
                case 6:
                    System.out.println("Mostrar articulos disponibles");
                    break;
                case 7:
                    System.out.println("Buscar por Id");
                    break;
                default:
                    System.out.println("Esa no es una opción");
                    break;

            }
        }while(opcion!=9);

    }

}
