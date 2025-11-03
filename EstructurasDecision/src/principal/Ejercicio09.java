package principal;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduce tu estado civil (Casado/a, Soltero/a, Viudo/a, Otro/a): ");
        String estadoCivil = teclado.nextLine().toLowerCase();

        System.out.print("Introduce tu sueldo bruto (€): ");
        double sueldoBruto = teclado.nextDouble();

        double irpf;

        switch (estadoCivil) {
            case "casado":
            case "casado/a":
                irpf = 0.08;
                break;
            case "soltero":
            case "soltero/a":
                irpf = 0.13;
                break;
            case "viudo":
            case "viudo/a":
                irpf = 0.10;
                break;
            default:
                irpf = 0.11;
                break;
        }

        double sueldoNeto = sueldoBruto - (sueldoBruto * irpf);

        if (sueldoNeto <= 1000) {
            System.out.print("Introduce el número de hijos/as: ");
            int numHijos = teclado.nextInt();

            if (numHijos > 1) {
                System.out.println("Sr. " + nombre + " BECA CONCEDIDA");
            } else {
                System.out.println("BECA NO CONCEDIDA");
            }
        } else {
            System.out.println("BECA NO CONCEDIDA");
        }
		
		teclado.close();
	}

}
