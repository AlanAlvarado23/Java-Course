public class BusquedaSubcadenas {
    static void main() {
        var cadena1 = "Hola Mundo";

        // indexOf devuelve el indice de la primera aparicion de la subcadena
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // indexOf devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        // No encontrada = -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
