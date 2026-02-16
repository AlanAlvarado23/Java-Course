public class GeneradorEmail {
    static void main() {
        var nombre = " Alan Alvarado  ";
        var empresa = "Global Mentoring";
        var dominio = ".com.mx";

        var nombreNormalizado = nombre.strip().replace(" ", ".").toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        var extension = new StringBuffer();
        extension.append("@").append(empresa.replace(" ", "").toLowerCase()).append(dominio);
        System.out.println("extension = " + extension);

        var email = new StringBuffer();
        email.append(nombreNormalizado).append(extension);
        System.out.println("email = " + email.toString());
    }
}
