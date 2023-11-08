// Hágase un programa que lea dos variables enteras y obtenga las
// siguientes operaciones:
// • Suma
// • Resta
// • Multiplicación
// • División entera
// • Resto entero
public class Tema_2_ejercicio_3{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(suma(a, b));
        System.out.println(resta(a, b));
        System.out.println(multiplicacion(a, b));
        System.out.println(division_entera(a, b));
        System.out.println(resto_entero(b, a));
    }
    

    public static int suma(int a, int b){
        return a + b;
    }


    public static int resta(int a, int b){
        return a - b;
    }


    public static int multiplicacion(int a, int b){
        return a * b;
    }


    public static int division_entera(int a, int b){
        return a / b;
    }

    
    public static int resto_entero(int a, int b){
        return a % b;
    }
}