import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        String nombre, apellidos;
        int edad;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        nombre = input.nextLine();

        System.out.println("Ingresa tus apellidos: ");
        apellidos = input.nextLine();

        System.out.println("Ingresa tu edad: ");
        edad = input.nextInt();

        if (edad>=18) {
            System.out.println(nombre+" "+apellidos+" usted es mayor de edad, por lo tanto, puede entrar a la fiesta.");
        }
        else {
            System.out.println(nombre+" "+apellidos+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}
