public class IndicesCadena {
    static void main() {
        var cadena1 = "Hola Mundo";


        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        // Ultimo char
        var ultimoCaracter = cadena1.charAt(cadena1.length() - 1);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // O
        ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
    }
}
