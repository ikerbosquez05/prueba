package principal; // El programa está dentro del paquete "principal"

public class Ejercicio6 {

	public static void main(String[] args) {

		// Variables
		float CostoTarea = 12.5f, CostoEmpresa = 0;
		float SueldoBase, SueldoBonus, SueldoMaximo;
		int NumTrabajadores, DiasTrabajados;
		int ContTrabajadores = 1;
		int Tareas, Extras;

		// Pedir número de trabajadores
		do {
			System.out.print("¿Cuántos trabajadores se van a registrar? ");
			NumTrabajadores = Util.leerInt();
			if (NumTrabajadores <= 0) {
				System.out.println("Por favor, ingrese un número válido de trabajadores (mayor a 0).");
			}
		} while (NumTrabajadores <= 0);

		// Bucle principal: repetir para cada trabajador
		while (ContTrabajadores <= NumTrabajadores) {
			System.out.println("Trabajador " + ContTrabajadores);

			// Pedir días trabajados
			do {
				System.out.print("Número de días trabajados en la semana: ");
				DiasTrabajados = Util.leerInt();
				if (DiasTrabajados <= 0) {
					System.out.println("El número de días debe ser mayor a 0.");
				}
			} while (DiasTrabajados <= 0);

			// Reiniciar variables por trabajador
			SueldoBase = 0;
			SueldoBonus = 0;
			int ContDias = 1;

			// Bucle por cada día trabajado
			while (ContDias <= DiasTrabajados) {

				// Pedir número de tareas realizadas en el día
				do {
					System.out.print("Tareas completadas el día " + ContDias + ": ");
					Tareas = Util.leerInt();
					if (Tareas < 0) {
						System.out.println("El número de tareas no puede ser negativo.");
					}
				} while (Tareas < 0);

				// Sueldo diario normal (sin bonus)
				float SueldoDiaBase = Tareas * CostoTarea;
				SueldoBase += SueldoDiaBase; // Se acumula al sueldo base

				// Calcular bonus si el trabajador hizo más de 10 tareas
				if (Tareas > 10) {
					Extras = Tareas - 10; 
					// Las primeras 10 tareas se pagan normal, las extras con 10%
					SueldoBonus += (10 * CostoTarea) + (Extras * CostoTarea * 1.1f);
				} else {
					// Si hizo 10 o menos, se paga normal
					SueldoBonus += SueldoDiaBase;
				}

				ContDias++;
			}

			// Límite máximo de sueldo
			SueldoMaximo = SueldoBase * 1.25f;
			if (SueldoBonus > SueldoMaximo) {
				SueldoBonus = SueldoMaximo; // Si supera el límite, se ajusta
			}

			// Mostrar sueldo final del trabajador
			System.out.printf("Sueldo semanal del trabajador %d: %.2f €%n", ContTrabajadores, SueldoBonus);

			// Acumular el costo en el total de la empresa
			CostoEmpresa += SueldoBonus;
			ContTrabajadores++;
		}

		// Mostrar costo total de la empresa
		System.out.printf("%nCosto total para la empresa: %.2f €%n", CostoEmpresa);

	}
}