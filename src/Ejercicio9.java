import java.util.Scanner;

public class Ejercicio9 {

    public static class CalculadorDescuentoEscalonado {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("--- Sistema de Descuentos por Rangos de Compra ---");


            System.out.print("Ingresa el valor total de la compra: $");
            double compra = scanner.nextDouble();


            double porcentajeDescuento = 0.0;
            double montoDescuento = 0.0;
            double totalAPagar = 0.0;


            if (compra < 100) {
                porcentajeDescuento = 0.0; // Sin descuento
            } else if (compra >= 100 && compra <= 300) {
                porcentajeDescuento = 0.10; // 10% de descuento
            } else {
                porcentajeDescuento = 0.15; // 15% de descuento (mayor a 300)
            }


            montoDescuento = compra * porcentajeDescuento;
            totalAPagar = compra - montoDescuento;


            System.out.println("\n--- Resumen de la Operación ---");
            System.out.printf("Valor de la compra:    $%8.2f%n", compra);
            System.out.printf("Descuento aplicado:    $%8.2f (%.0f%%)%n", montoDescuento, (porcentajeDescuento * 100));
            System.out.println("----------------------------------");
            System.out.printf("Monto total a pagar:   $%8.2f%n", totalAPagar);


            scanner.close();
        }
    }
}