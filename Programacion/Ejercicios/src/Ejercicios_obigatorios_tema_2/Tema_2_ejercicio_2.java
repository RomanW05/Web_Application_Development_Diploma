// Hágase un programa que lea 5 variables enteras y haga lo siguiente:
// • Las muestre en una línea separadas por un espacio.
// • Rote los valores hacia la izquierda (la primera variable tome el valor de
// la segunda; la segunda, la de la tercera; la tercera, la de la cuarta; la
// cuarta, la de la quinta; y la quinta, la de la primera.
// • Se muestren de nuevo el valor de las cinco variables de la misma
// forma que en el apartado a).
public class Tema_2_ejercicio_2 {
    public static void main (String[] args){
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int x;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
        x = a;
        a = b;
        b = c;
        c = d;
        d = e;
        e = x;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);

        x = e;
        e = d;
        d = c;
        c = b;
        b = a;
        a = x;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e);
    }
}