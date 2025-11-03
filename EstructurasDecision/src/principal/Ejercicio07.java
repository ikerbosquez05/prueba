package principal;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el precio por unidad: ");
        double precio = teclado.nextDouble();

        System.out.print("Introduce la cantidad de unidades: ");
        int cantidad = teclado.nextInt();

        double totalSinDescuento = precio * cantidad;
        double descuento = 0;
        
        if (cantidad > 100) {
            descuento = 0.40;
        } else if (cantidad >= 25) {
            descuento = 0.20;
        } else if (cantidad >= 10) {
            descuento = 0.10;
        } else {
            descuento = 0.0;
        }

        double importeDescuento = totalSinDescuento * descuento;
        double totalFinal = totalSinDescuento - importeDescuento;

        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Importe del descuento: $" + String.format("%.2f", importeDescuento));
        System.out.println("Precio final a pagar: $" + String.format("%.2f", totalFinal));
        
		
		teclado.close();
	}

}
