import java.util.Scanner;

public class Ejercicio5 {

    public static class ControlNotasEstudiante {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Definimos la nota mínima para aprobar como una constante
            final double NOTA_MINIMA_APROBATORIA = 6.0;

            System.out.println("--- Sistema de Control de Notas y Promedios ---");

            // Solicitar las tres notas
            System.out.print("Ingresa la primera nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Ingresa la segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Ingresa la tercera nota: ");
            double nota3 = scanner.nextDouble();


            double promedio = (nota1 + nota2 + nota3) / 3.0;


            System.out.println("\n--- Reporte del Estudiante ---");
            System.out.printf("Promedio final: %.2f%n", promedio);


            if (promedio >= NOTA_MINIMA_APROBATORIA) {
                System.out.println("Estado: ¡APROBADO! ");
            } else {
                System.out.println("Estado: REPROBADO ");
            }


            scanner.close();
        }
    }
}
