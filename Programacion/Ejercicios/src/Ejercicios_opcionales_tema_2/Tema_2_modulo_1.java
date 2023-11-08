/**En este ejemplo podemos ver los dos usos. El métodoUno se llama a través del objeto de la clase (new Main),
mientras que el métodoDos se llama directamente por ser estático y estar en la misma clase de donde es llamado
1. Crea un nuevo programa que muestre ¡Hola mundo!, para la salida por consola se haga en un método sin datos 
de entrada ni salida de nombre “saludar”.
2. Crea un método que se llame saludarPerso el cual admita un parámetro de tipo string y muestre por consola
el mensaje "Hola NombreIntroducido".
3. Crea un programa en el se defina una constante global con el valor del número pi (3,1416) y se muestre por
consola. Se definirá un método de nombre “mostrarPI” sin datos de entrada ni salida. (mostrarPI)
4. Crea un método que admita como parámetros dos números y muestre por consola su suma.**/

public class Tema_2_modulo_1{
    static double pi = 3.1416;
    public static void main(String[] args) {
        saludar();
        saludarPerso("Roman");
        mostrarPI();
        suma(1, 2);
    }


    public static void saludar(){
        System.out.println("!Hola mundo!");
    }


    public static void saludarPerso(String nombre){
        System.out.println("Hola " + nombre);
    }


    public static void mostrarPI(){
        System.out.println(pi);
    }


    public static void suma(int a, int b){
        System.out.println(a + b);
    }



}