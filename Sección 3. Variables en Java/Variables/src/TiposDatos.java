public class TiposDatos {
    static void main() {
        // Tipos de Datos en Java

        // Enteros (su valor default es 0)
        byte tipoByte = 127; // Max 127 (O "byte tipoByte = (byte)128" (impreciso)
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = (short)320000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar que es long (int por defecto)
        System.out.println("tipoLong = " + tipoLong);

        // Flotantes (su valor default es 0.0)
        float tipoFloat = 3.14F; // F o f para indicar que es float (sino, double por defecto)
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (su valor default es '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // Equivalente a 'A'

        // Booleano (su valor default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String tipoString = null;
        System.out.println("tipoString = " + tipoString);
        tipoString = "Alan Alvarado";
        System.out.println("tipoString = " + tipoString);


    }
}
