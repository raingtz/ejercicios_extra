//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio7 {
 public static void main(String[] args) {
        System.out.print("COMPROBAR SI ERES VIP\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.print("Tienes invitacion?:\n"
                + "1-Si\n2-No\n ");
        int invi= scanner.nextInt();
        if(edad>=18 || invi==1){
            System.out.println("Eres VIP");
        }else if(edad<18 && invi==2){
            System.out.println("No eres VIP");
        }
    }   
}
