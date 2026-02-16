import java.util.Scanner;

public class RecetasCocina {
    static void main() {
        System.out.println("*** Recetas de Cocinas ***");

        var cons = new Scanner(System.in);

        System.out.print("Nombre de la receta: ");
        var nombreReceta = cons.nextLine();

        System.out.print("Ingredientes (separados por coma): ");
        var ingredientes = cons.nextLine();

        System.out.print("Tiempo de preparacion (mins): ");
        var tiempoPreparacion = Integer.parseInt(cons.nextLine());

        System.out.print("Dificultad (facil/medio/dificil): ");
        var dificultad = cons.nextLine();

        System.out.println("\n--- Informacion de receta ---");
        System.out.println("\tNombre: " + nombreReceta);
        System.out.println("\tIngredientes = " + ingredientes);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion);
        System.out.println("\tDificultad = " + dificultad);

    }
}
