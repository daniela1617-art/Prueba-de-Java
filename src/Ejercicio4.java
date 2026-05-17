import java.util.Scanner;

public class Ejercicio4 {


    public static class CalcularHipotenusa {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Calculadora de Hipotenusa (Teorema de Pitágoras) ---");


            System.out.print("Ingresa la longitud del cateto 'a': ");
            double catetoA = scanner.nextDouble();


            System.out.print("Ingresa la longitud del cateto 'b': ");
            double catetoB = scanner.nextDouble();

            // Calcular la hipotenusa: raíz cuadrada de (a^2 + b^2)
            // Math.sqrt() calcula la raíz cuadrada
            // Math.pow(x, 2) eleva un número al cuadrado
            double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

            // Mostrar el resultado con dos decimales
            System.out.println("\n--- Resultado ---");
            System.out.printf("Para los catetos %.2f y %.2f,%n", catetoA, catetoB);
            System.out.printf("la longitud de la hipotenusa es: %.2f%n", hipotenusa);


            scanner.close();
        }
    }
}
