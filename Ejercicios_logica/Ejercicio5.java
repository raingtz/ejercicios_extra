//Lluvia Mariana Gutierrez Interian
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.print("COMPROBAR SI ERES ADULTO o JUBILADO\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        if(edad>=18 && edad<=65){
            System.out.println("Todavia estas en edad productiva");
        }else if(edad<18 && edad>=0 || edad>65){
            System.out.println("Estas en edad de descansar");
        }
    }
}
