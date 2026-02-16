public class FormateoCadenas {
    static void main() {
        var nombre = "Matias";
        var edad = 35;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;
        // Formato text block
        mensaje = """
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f""".formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        System.out.printf("""
                %nDetalle Persona:\s
                -----------------
                \tNombre: %s    
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f""".formatted(nombre, numeroEmpleado, edad, salario));
    }
}
