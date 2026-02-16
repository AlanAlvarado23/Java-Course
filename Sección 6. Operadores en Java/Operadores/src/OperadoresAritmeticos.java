public class OperadoresAritmeticos {
    static void main() {
        double a = 5, b = 3, resultado; // No se puede usar var

        resultado = a + b;
        System.out.println("Suma = " + resultado);

        resultado = a - b;
        System.out.println("Resta = " + resultado);

        resultado = a * b;
        System.out.println("Multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("Division = " + resultado);

        resultado = a % b;
        System.out.println("Modulo (residuo division) = " + resultado);
    }
}
