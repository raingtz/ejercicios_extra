//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI NUMERO ES MAYOR A 100 O MENOR QUE -100\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();
        if(num>100){
            System.out.println("Numero mayor que 100");
        }else if(num<-100){
            System.out.println("Numero menor que -100");
        }else if(num<=100 && num>=-100){
            System.out.println("El numero esta dentro de -100 y 100");
        }
    }   
}
