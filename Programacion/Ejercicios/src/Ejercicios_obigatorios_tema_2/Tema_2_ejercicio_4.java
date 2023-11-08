// Hágase un programa que convierta segundos en horas, minutos y
// segundos.
public class Tema_2_ejercicio_4{
    public static void main(String[] args) {
        System.out.println(segundos_a_minutos(1));
        System.out.println(segundos_a_horas(1));
        System.out.println(minutos_a_segundos(1));
        System.out.println(minutos_a_horas(1));
        System.out.println(horas_a_segundos(1));
        System.out.println(horas_a_minutos(1));
    }


    public static float segundos_a_minutos(float segundos){
        return segundos / 60;
    }


    public static float segundos_a_horas(float segundos){
        return segundos / 60 / 60;
    }


    public static float minutos_a_segundos(float minutos){
        return minutos * 60;
    }


    public static float minutos_a_horas(float minutos){
        return minutos / 60;
    }


    public static float horas_a_segundos(int horas){
        return horas * 60 * 60;
    }


    public static float horas_a_minutos(int horas){
        return horas * 60;
    }
}