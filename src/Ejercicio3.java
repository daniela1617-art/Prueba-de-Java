import java.util.Scanner;

public class Ejercicio3 {

    public static class CalculadorDescuento {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            final double PORCENTAJE_DESCUENTO = 0.10;

            System.out.println("--- Sistema de Facturación con Descuento del 10% ---");


            System.out.print("Ingresa el monto total de la compra: $");
            double montoCompra = scanner.nextDouble();


            double montoDescuento = montoCompra * PORCENTAJE_DESCUENTO;


            double totalAPagar = montoCompra - montoDescuento;


            System.out.println("\n--- Resumen de Cuenta ---");
            System.out.printf("Monto original:   $%8.2f%n", montoCompra);
            System.out.printf("Descuento (10%%): -$%8.2f%n", montoDescuento);
            System.out.println("----------------------------");
            System.out.printf("Total a pagar:    $%8.2f%n", totalAPagar);


            scanner.close();
        }
    }
}
