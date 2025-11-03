package principal;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce una nota entre 0 y 10: ");
        float nota = teclado.nextFloat();

        if (nota < 0 || nota > 10) {
            System.out.println("❌ Nota no válida. Debe estar entre 0 y 10.");
        } else if (nota < 5) {
            System.out.println("SUSPENSO");
        } else if (nota < 7) {
            System.out.println("APROBADO");
        } else if (nota < 9) {
            System.out.println("NOTABLE");
        } else {
            System.out.println("SOBRESALIENTE");
        }
		
		teclado.close();
	}

}
