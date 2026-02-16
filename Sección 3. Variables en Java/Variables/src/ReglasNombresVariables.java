public class ReglasNombresVariables {
    static void main() {
        // Reglas nombres variables
        String nombreCompleto = "Alan Alvarado";
        System.out.println("nombreCompleto = " + nombreCompleto);

        String NombreCompleto = "Alan Alvarado";
        System.out.println("NombreCompleto = " + NombreCompleto);

        String nombre_cliente = "Alan"; // Correcto pero no son buenas practicas EN JAVA
        String _apellido = "Alvarad"; // Curiosamente ESTO SI ES BUENA PRACTICA
        String $apellido = "Ahedo"; // Correcto y aceptable

        boolean isCasado = true; // Buenas practicas
    }
}
