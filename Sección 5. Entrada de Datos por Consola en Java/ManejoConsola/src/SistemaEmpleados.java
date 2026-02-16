import java.util.Scanner;

public class SistemaEmpleados {
    static void main() {
        System.out.println("Sistema de empleados");

        var consola = new Scanner(System.in);

        // Nombre empleado
        System.out.print("Nombre del empleado: ");
        var nombre = consola.nextLine();

        // Edad empleado
        System.out.print("Edad del empleado: ");
        var edad = Integer.parseInt(consola.nextLine());

        // Salario empleado
        System.out.print("Salario del empleado: ");
        var salario = Double.parseDouble(consola.nextLine());

        // Es jefe de dpto.
        System.out.print("Es jefe de departamento (true/false): ");
        var esJefeDepartamento =  Boolean.parseBoolean(consola.nextLine());

        // Imprimir info
        System.out.println("\nDatos capturados:");
        System.out.println("\tNombre = " + nombre);
        System.out.println("\tEdad = " + edad + "años");
        System.out.printf("\tSalario = $%.2f%n", salario);
        System.out.println("\tSalario = $%.2f".formatted(salario));
        System.out.println("\tEsJefeDepartamento = " + esJefeDepartamento);
    }
}
