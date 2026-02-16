public class OperadoresUnarios {
    static void main() {
        int a = 3, b = -2, resultado;
        var c = true;

        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Valores unarios de incremento y decremento

        a = 3;
        resultado = ++a;
        System.out.println("resultado = " + resultado);
        System.out.println("a tambien se incrementa = " + a);

        a = 3;
        resultado = a++;
        System.out.println("resultado no incrementa = " + resultado);
        System.out.println("a si se incrementa = " + a);

        // Pre-Decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado b = " + resultado);
        System.out.println("b = " + b);

        // Post-decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado b = " + resultado);
        System.out.println("b = " + b);

    }
}
