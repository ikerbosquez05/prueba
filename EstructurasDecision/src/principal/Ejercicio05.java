package principal;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la nota máxima posible: ");
        double notaMaxima = teclado.nextDouble();

        System.out.print("Introduce la nota obtenida por el alumno: ");
        double notaObtenida = teclado.nextDouble();

        teclado.nextLine();

        System.out.print("¿Ha hecho todos los trabajos? (si/no): ");
        String trabajosHechos = teclado.nextLine().trim().toLowerCase();

        boolean notaSuficiente = notaObtenida >= (notaMaxima / 2);
        boolean trabajosCompletos = trabajosHechos.equals("si");

        if (notaSuficiente && trabajosCompletos) {
            System.out.println("El alumno ha aprobado.");
        } else {
            System.out.println("El alumno no ha aprobado.");
        }
		
		teclado.close();
	}

}
