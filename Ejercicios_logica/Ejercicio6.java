//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio6 {
     public static void main(String[] args) {
        System.out.print("COMPROBAR SI PUEDES VOTAR\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if(edad>=18){
            System.out.println("Puedes votar!");
        }else if(edad<18 && edad>=0){
            System.out.println("Todavia estas pequeñe");
        }
    }
}
