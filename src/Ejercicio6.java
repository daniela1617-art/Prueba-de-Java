import java.util.Scanner;

public class Ejercicio6 {

    public static class ClasificadorNumeros {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Clasificador de Números (Positivo, Negativo o Neutro) ---");


            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();


            System.out.println("\n--- Resultado ---");

            if (numero > 0) {
                System.out.println("El número " + numero + " es: POSITIVO (+)");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " es: NEGATIVO (-)");
            } else {
                System.out.println("El número ingresado es: NEUTRO (0)");
            }


            scanner.close();
        }
    }

}
