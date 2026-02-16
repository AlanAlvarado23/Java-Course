import java.util.Scanner;

public class ManejoConsola {
    static void main() {
        var consola = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
