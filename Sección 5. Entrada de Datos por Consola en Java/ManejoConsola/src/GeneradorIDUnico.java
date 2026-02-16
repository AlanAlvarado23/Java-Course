import java.util.Scanner;
import java.util.Random;

public class GeneradorIDUnico {
    static void main(String[] args) {

        var consola = new Scanner(System.in);
        var random = new Random();

        System.out.print("Introduce tu nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Introduce tu apellido: ");
        var apellido = consola.nextLine();

        System.out.print("Introduce tu año de nacimiento (YYYY): ");
        var nacimiento = consola.nextLine();

        var numeroAleatorio = random.nextInt(9999)+1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        var idFormateado = "%s%s%s%04d".formatted(
                nombre.substring(0, 2).toUpperCase(),
                apellido.substring(0, 2).toUpperCase(),
                nacimiento.substring(2, 4),
                numeroAleatorio
        );

        System.out.println("idFormateado = " + idFormateado);

    }
}
