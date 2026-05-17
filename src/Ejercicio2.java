import java.util.Scanner;

public class Ejercicio2 {

    public static class AreaCircunferencia {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Calculadora de Área de una Circunferencia ---");


            System.out.print("Ingresa el radio de la circunferencia: ");
            double radio = scanner.nextDouble();


            double area = Math.PI * Math.pow(radio, 2);


            System.out.println("\n--- Resultado ---");
            System.out.printf("El área de la circunferencia con radio %.2f es: %.2f%n", radio, area);


            scanner.close();
        }
    }
}

