//        Hágase un programa en el que se declare constantes locales con tu
//        nombre completo, la dirección de tu casa (sólo la calle), el número del
//        portal, el piso, la letra del piso, el código postal, la localidad, la provincia y
//        el país. Muéstrese por consola dichos datos almacenados en las
//        constantes como si fuera la dirección a la que se enviaría una carta.
public class Tema_2_ejercicio_1{
    public static void main (String[] args){
        String nombre_completo = "Roman Rafael Walden Nieto";
        String direccion_casa = "Panerio gatve";
        short codigo_postal = 21423;
        String localidad = "Trakai";
        String provincia = "Vilnius";
        String pais = "Lituania";
 
        System.out.println(nombre_completo + "\n" + direccion_casa + "\n" + localidad + " (" + provincia + ")\n" + codigo_postal + "\n" + pais );
    }
}