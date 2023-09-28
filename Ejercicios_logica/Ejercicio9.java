//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI TRIANGULO ES EQUILATERO O ISOSCELES\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la medida de lado 1: ");
        int lado1 = scanner.nextInt();
        System.out.print("Ingrese la medida de lado 2: ");
        int lado2 = scanner.nextInt();
        System.out.print("Ingrese la medida de lado 3: ");
        int lado3 = scanner.nextInt();
        if(lado1==lado2 && lado2==lado3){
            System.out.println("El triangulo es equilatero");
        }else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
            System.out.println("El triangulo es isosceles");
        }else if(lado1!=lado2 && lado2!=lado3){
            System.out.println("Ese esta chueco");
        }
    }
   
}
