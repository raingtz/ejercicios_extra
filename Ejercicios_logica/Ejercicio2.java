//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI UN NUMERO ES DIVISIBLE ENTRE 2 Y 3\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if(numero%2==0 && numero%3==0){
            System.out.println("El numero es divisible entre 2 y 3");
        }else{
            System.out.println("No es divisible por algun numero");
        }
    }
}
