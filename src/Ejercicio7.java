import java.util.Scanner;

public class Ejercicio7 {

    public static class ControlNotasValidado {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            final double NOTA_MINIMA_APROBATORIA = 6.0;


            double nota1 = 0, nota2 = 0, nota3 = 0;

            System.out.println("--- Sistema de Control de Notas (Validación de 0 a 10) ---");

            // --- VALIDACIÓN DE LA NOTA 1 ---
            System.out.print("Ingresa la primera nota (0 - 10): ");
            nota1 = scanner.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
                System.out.print("Inténtalo de nuevo. Ingresa la primera nota: ");
                nota1 = scanner.nextDouble();
            }

            // --- VALIDACIÓN DE LA NOTA 2 ---
            System.out.print("Ingresa la segunda nota (0 - 10): ");
            nota2 = scanner.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
                System.out.print("Inténtalo de nuevo. Ingresa la segunda nota: ");
                nota2 = scanner.nextDouble();
            }

            // --- VALIDACIÓN DE LA NOTA 3 ---
            System.out.print("Ingresa la tercera nota (0 - 10): ");
            nota3 = scanner.nextDouble();
            while (nota3 < 0 || nota3 > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
                System.out.print("Inténtalo de nuevo. Ingresa la tercera nota: ");
                nota3 = scanner.nextDouble();
            }

            // Calcular el promedio una vez que estamos seguros de que las notas son válidas
            double promedio = (nota1 + nota2 + nota3) / 3.0;


            System.out.println("\n--- Reporte Final del Estudiante ---");
            System.out.printf("Notas registradas: [%.1f] - [%.1f] - [%.1f]%n", nota1, nota2, nota3);
            System.out.printf("Promedio final:     %.2f%n", promedio);


            if (promedio >= NOTA_MINIMA_APROBATORIA) {
                System.out.println("Estado:¡APROBADO! ");
            } else {
                System.out.println("Estado:REPROBADO ");
            }

            scanner.close();
        }
    }
}
