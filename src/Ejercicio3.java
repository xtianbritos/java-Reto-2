import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        String opcion;

        Scanner input = new Scanner(System.in);

        System.out.println("¿Desea comprar un producto?");
        opcion = input.nextLine();

        if(opcion.equals("si")) {
            System.out.println("Gracias por elegirnos.");
        }else {
            System.out.println("¿Desea consultar el precio de un producto?");
            opcion = input.nextLine();

            if (opcion.equals("si")) {
                System.out.println("Actualmente no disponemos de esta función.");
            }else {
                System.out.println("¿Desea devolver un producto?");
                opcion = input.nextLine();

                if (opcion.equals("si")) {
                    System.out.println("Lo siento, eso no es posible.");
                }
                else {
                    System.out.println("Gracias por usar nuestro servicio.");
                }
            }
        }
    }
}
