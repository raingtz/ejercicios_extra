//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI TIENES CALIFICACION APROBATORIA\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su calificacion: ");
        int calificacion = scanner.nextInt();
        if(calificacion>=60 && calificacion<=100){
            System.out.println("Has aprobado");
        }else if(calificacion<60 && calificacion>=0){
            System.out.println("Has reprobado");
        }else if(calificacion<0 || calificacion>100){
            System.out.println("Eso ya es otra cosa");
        }
    }
}
