import java.util.Scanner;

public class Ejercicio1 {

    public static class CalcularAreaRectangulo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Calculadora de Área de un Rectángulo ---");


            System.out.print("Ingresa la base del rectángulo: ");
            double base = scanner.nextDouble();


            System.out.print("Ingresa la altura del rectángulo: ");
            double altura = scanner.nextDouble();


            double area = base * altura;


            System.out.println("\n--- Resultado ---");
            System.out.println("Con una base de " + base + " y una altura de " + altura + ",");
            System.out.println("el área total del rectángulo es: " + area);


            scanner.close();
        }
    }
}
