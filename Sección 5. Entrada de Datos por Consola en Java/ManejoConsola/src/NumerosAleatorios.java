import java.util.Random;

public class NumerosAleatorios {
    static void main() {
        var random = new Random();

        // Aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular dado (1 y 6)
        var dado = random.nextInt(6) + 1;
        System.out.println("Lanzar dado = " + dado);
    }
}
