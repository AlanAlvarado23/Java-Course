import java.util.Scanner;

public class LeerTiposDatos {
    static void main() {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad:");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // Valor Double
        System.out.print("Ingresa tu altura:");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // Consumir el \n despues de insertar los datos de int y/o Double
        consola.nextLine();

        // Leer un tipo string
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);


        // Conversion de datos
        System.out.print("Proporciona un int: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        // Conv float
        System.out.print("Proporciona un valor float: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Boolean.parseBoolean(consola.nextLine());
        // Double.parseDouble(consola.nextLine());


    }
}
