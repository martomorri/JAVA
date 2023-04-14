package cursojava;

public class EjercicioArraysBidimensionales {

	public static void main(String[] args) {
		double[][] capital_incrementado = new double[6][5];
		int porcentaje = 10;
		
		inicializarMatriz(capital_incrementado);
		calcularCapital(capital_incrementado, porcentaje);
		mostrarPorPantalla(capital_incrementado, porcentaje);
	}
	
	public static void inicializarMatriz(double[][] capital_incrementado) {
		for (int i = 0; i < 6; i++) {
			for (int n = 0; n < 5; n++) {
				capital_incrementado[i][n] = 10000;
			}
		}
	}
	
	public static void calcularCapital(double[][] capital_incrementado, int porcentaje) {
		for (int i = 0; i < 6; i++) {
			//porcentaje = 10;
			for (int n = 1; n < 5; n++) {
				capital_incrementado[i][n] = capital_incrementado[i][n-1];
				capital_incrementado[i][n] += capital_incrementado[i][n-1]*porcentaje/100;
			}
			porcentaje++;
		}
	}
	
	public static void mostrarPorPantalla(double[][] capital_incrementado, int porcentaje) {
		/*for (int i = 0; i < 6;  i++) {
			System.out.print((porcentaje+i) + "%      ");
		}*/
		for (double[] fila: capital_incrementado) {
			System.out.println();
			for (double x : fila) {
				System.out.printf("%1.2f", x);
				System.out.print(" ");
			}
		}
	}

}
