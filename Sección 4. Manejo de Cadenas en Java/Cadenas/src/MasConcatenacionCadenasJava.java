public class MasConcatenacionCadenasJava {
    static void main() {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = "Hola" + " Mundo";
        System.out.println("cadena3 = " + cadena3);

        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 = " + cadena3);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append("");
        constructorCadenas.append(cadena2);
        var resultado =  constructorCadenas.toString();
        System.out.println("StringBuilder = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append("cadena2");
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + resultado);

        // Join
        resultado = String.join(" ", cadena1, cadena2, "adios");
        System.out.println("Join = " + resultado);
    }
}
