//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI UN NUMERO ES PAR O MULTIPLO DE 5\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
         int numero = scanner.nextInt();
        if(numero%5==0 && numero%2==0){
            System.out.println("El numero es par y multiplo de 5");
        }else if(numero%5==0 && numero%2!=0){
            System.out.println("El numero es multiplo de 5");
        }else if(numero%2==0 && numero%5!=0){
            System.out.println("El numero es par");
        }else
            System.out.println("No es ni par ni multiplo de 5");
    }
}
