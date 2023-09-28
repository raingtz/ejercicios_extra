//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI UN NUMERO ES MAYOR QUE 10 Y MENOR QUE 20\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero < 20 && numero > 10){
            System.out.print("El numero es mayor que 10 y menor que 20\n");
        }
        if (numero == 10 || numero == 20){
            System.out.print("El numero es uno de los limites");
        }else if(numero>20 || numero<10 && numero!=10 || numero!=20 && numero>20 && numero<10 ){
        System.out.print("El numero no esta dentro del rango");
        }
       scanner.close();
    }
}
