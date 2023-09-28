//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI UN NUMERO ES POSITIVO Y NO ES IGUAL A CERO\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if(numero==0){
            System.out.println("El numero es 0");
        }else if(numero>0){
            System.out.println("El numero es positivo");
        }else if(numero<0){
            System.out.println("El numero es negativo");
        }
    }
   
}
