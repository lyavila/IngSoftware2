import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void cadena (String operacion){
		String[] numero = operacion.split("[-*/+]");
		String[] operador = operacion.split("[0-9]");
		int n = 0;
		int cont = 1;
		int resultado = 0;
		
		ArrayList<Integer> totalN = new ArrayList<Integer>();
		for (int i = 0; i < numero.length; i++) {
			n = Integer.parseInt(numero[i]);
			totalN.add(i, n);
		}

		resultado = totalN.get(0);

		for (int a = 0; a < numero.length; a++) {
			if (operador[a].equals("+")) {
				resultado = Operaciones.suma(resultado, totalN.get(cont));
				cont = +1;
			} else if (operador[a].equals("-")) {
				resultado = Operaciones.resta(resultado, totalN.get(cont));
				cont = +1;
			} else if (operador[a].equals("*")) {
				resultado = Operaciones.multiplicacion(resultado, totalN.get(cont));
				cont = +1;
			} else if (operador[a].equals("/")) {
				resultado = Operaciones.division(resultado, totalN.get(cont));
				cont = +1;
			} else System.out.println("operacion no valida");

		}
		System.out.println(resultado);
	}
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String terminar = "1";
		System.out.print("Escriba s para terminar");
		while (terminar.equals("1")) {

			System.out.print("\n\nDigite su operación ");
			String operacion = teclado.nextLine();

			if (operacion.equals("s") || operacion.equals("exit")) {
				terminar = "no";
			} else {
				if (operacion.isEmpty()) {

				} else {
					cadena(operacion);
				}
			}
		}

		teclado.close();
	}
}
