import java.lang.Math;
public class decimal_2_binary{
    public static void main(String[] args){
        // int ejercicios1[] = {2, 5, 7, 8, 13, 17, 27, 31, 39, 42, 45, 51, 56, 63, 68, 73, 76, 85, 91, 99, 110, 127, 144, 176, 189, 199, 204, 222, 256, 300};
        // for (int elem: ejercicios1){
        //     System.out.println(elem + " = " + decimal2binary(elem));
        // }
        // int ejercicios2[] = {1101, 10101, 11100, 10011, 11001, 10000, 11000, 11110, 10101, 11111, 10001, 11011, 10000, 10101, 11111, 11011, 10010, 11001, 10110, 11111, 10010, 11001, 10000, 10111, 11110, 11011, 10010, 11000, 10101, 11100};
        // for (int elem: ejercicios2){
        //     System.out.println(elem + " = " + binary_2_decimal(elem));
        // }
        suma(11, 10);
    }

    
    public static String decimal2binary(int number){
        String binary_number = "";
        int residuo;
        while (true){
            residuo = number % 2;
            number = number / 2;
            binary_number = residuo + binary_number;
            if (number < 2){
                residuo = number % 2;
                binary_number = residuo + binary_number;
                break;
            }
        }
        return binary_number;
    }

    
    public static int binary_2_decimal(int number){
        int decimal_number = 0;
        String binary_number = String.valueOf(number);
        String reversed_binary = "";

        // Reverse string
        char character;
        for (int i=0; i<binary_number.length(); i++){
            character = binary_number.charAt(i);
            reversed_binary = character + reversed_binary;
        }

        // Calculate decimal
        for (int i = reversed_binary.length() - 1; i > -1; i--){
            int value = Integer.parseInt(String.valueOf(reversed_binary.charAt(i)));
            if (value == 0){continue;}
            decimal_number += Math.pow(2, i);
        }
        return decimal_number;
    }


    // Cuidado, a y b son int cuando en realidad presentan binarios
    // int pueden ser valores > 1 pero binarios no
    // pudiera haber sumado ambos 
    public static String suma(int a, int b){
        String result = "";
        String str_a = String.valueOf(a);
        String str_b = String.valueOf(b);
        int length_of_a = str_a.length();
        int length_of_b = str_b.length();
        if (length_of_a > length_of_b){
            //TODO crear algoritmo para suma
        }

        return result;
    }
}