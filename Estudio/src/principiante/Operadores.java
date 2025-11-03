package principiante;

public class Operadores {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;
		int c = a + b;
		System.out.println(c);

		System.out.println(a == b);
		System.out.println(a == 2);

		System.out.println(a != b);

		// Logicos

		// Y (AND) Si una sola expresion es false dara false solamente sera verdadera
		// cuando las dos condiciones se cumplan
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);

		System.out.println(3 == 2 && 1 == 6);

		// O (OR) Si una sola expresion es true dara true solamente sera falsa cuando
		// las dos condiciones no se cumplan
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);

		System.out.println(3 == 2 || 1 == 1);

		// NO (NOT)
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(3 == 2 || 1 == 1);
		System.out.println(3 == 2 || !(1 == 1));
	}

}
