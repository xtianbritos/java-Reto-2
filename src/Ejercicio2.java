import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String opcion, anotaciones;

        Scanner input = new Scanner(System.in);

        System.out.println("¿Desea alquilar una película?");
        opcion = input.nextLine();

        if (opcion.equals("si")) {
            System.out.println("Qué bien.");
        } else {
            System.out.println("¿Desea consultar películas disponibles?");
            opcion = input.nextLine();

            if(opcion.equals("si")) {
                System.out.println("Actualmente no disponemos de una lista de películas.");
            }
            else {
                System.out.println("¿Desea entregar una película?");
                opcion = input.nextLine();

                if (opcion.equals("si")) {
                    System.out.println("¿Desea realizar alguna anotación sobre la película?");
                    opcion = input.nextLine();

                    if (opcion.equals("si")) {
                        System.out.println("Ingrese su anotación:");
                        anotaciones = input.nextLine();
                    }
                    else {
                        System.out.println("Gracias por su colaboración.");
                    }
                }
                else {
                    System.out.println("Adios.");
                }
            }
        }
    }
}
