import java.util.Scanner;

public class Ejercicio8 {

    public static class EncontrarMayor {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Buscador del Número Mayor ---");

            // Solicitar los tres números
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingresa el tercer número: ");
            double num3 = scanner.nextDouble();


            double mayor = num1;


            if (num2 > mayor) {
                mayor = num2;
            }


            if (num3 > mayor) {
                mayor = num3;
            }


            System.out.println("\n--- Resultado ---");
            System.out.println("De los números ingresados (" + num1 + ", " + num2 + ", " + num3 + "),");
            System.out.println("el número mayor es: " + mayor);


            scanner.close();
        }
    }
}