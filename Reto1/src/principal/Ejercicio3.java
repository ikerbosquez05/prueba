package principal;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Declaración de variables
		int diaActual = 1, mesActual, añoActual, revision = 0, noRevision = 0, diaRevision, mesRevision, añoRevision,
				numSerie, i = 1;
		char seguir;

		// PEDIR FECHA ACTUAL Y VALIDAR
		// Pedir fecha actual
		do {
			System.out.print("Introduce la fecha actual");
			System.out.print("\nDía: ");
			diaActual = Util.leerInt();
			System.out.print("Mes: ");
			mesActual = Util.leerInt();
			System.out.print("Año: ");
			añoActual = Util.leerInt();
			// Validación fecha ingresada
			if (diaActual > 31 || diaActual < 1 || mesActual < 1 || mesActual > 12 || añoActual < 1950
					|| añoActual > 2025) {
				System.out.println("Esa fecha especificada no es valida, porfavor ingresa una fecha valida.");
			}
		} while (diaActual > 31 || diaActual < 1 || mesActual > 12 || mesActual < 1 || añoActual > 2025
				|| añoActual < 1950);
		// Se repite hasta que la fecha actual sea válida

		// PROCESO DE EXTINTORES
		do {
			// Pedir datos de cada extintor
			do {
				System.err.println("Extintor numero " + i);
				System.out.print("Número de serie del extintor: ");
				numSerie = Util.leerInt();
				System.out.print("Introduzca la fecha de la última revisión:");
				System.out.print("\nDía: ");
				diaRevision = Util.leerInt();
				System.out.print("Mes: ");
				mesRevision = Util.leerInt();
				System.out.print("Año: ");
				añoRevision = Util.leerInt();
				// Validación fecha revision
				if (diaRevision > 31 || diaRevision < 1 || mesRevision < 1 || mesRevision > 12 || añoRevision < 1950
						|| añoRevision > 2025) {
					System.out.println("Esa fecha especificada no es valida, porfavor ingresa una fecha valida.");
				}
			} while (diaRevision > 31 || diaRevision < 1 || mesRevision < 1 || mesRevision > 12 || añoRevision < 1950
					|| añoRevision > 2025);
			// Se repite hasta que la fecha de revisión sea válida

			// COMPROBAR SI NECESITA REVISIÓN
			// Comprobar si el año actual es más de un año que el de revisión
			if (añoActual > añoRevision + 1) {
				System.out.println("El extintor " + numSerie + " necesita revisión.");
				revision++;
			}
			// Si ha pasado exactamente un año, comprobamos mes y día
			else if (añoActual == añoRevision + 1
					&& (mesActual > mesRevision || (mesActual == mesRevision && diaActual >= diaRevision))) {
				System.out.println("El extintor " + numSerie + " necesita revisión.");
				revision++;
			}
			// Comprobar si no ha pasado un año
			else {
				System.out.println("El extintor " + numSerie + " NO necesita revisión.");
				noRevision++;
			}
			// Preguntar al usuario si quiere continuar con otro extintor
			System.out.println("¿Quiere Ud. seguir? Conteste S (si) o N (no): ");
			seguir = Util.leerChar();
			i++;

		} while ((seguir == 'S') || (seguir == 's'));

		// RESULTADO FINAL
		System.out.println("Extintores que hay que revisar: " + revision);
		System.out.println("Extintores que no hay que revisar: " + noRevision);
		System.out.println("Programa finalizado.");
	}
}
