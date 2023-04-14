package cursojava;

public class ArraysBidimensionales {

	public static void main(String[] args) {
		int[][] arrayBi = new int[4][5];
		
		//un ejemplo inicializando matriz
		//arrayBi[0][0] = 10;
		
		//System.out.println(arrayBi[0][0]);
		
		//rellenar una matriz con una funcion
		rellenarMatriz(arrayBi);
		
		//asi se recorre una matriz (si queres usar un for normal)
		/*for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int n = 0; n < 5; n++) {
				System.out.print(arrayBi[i][n] + " ");
			}
		}*/
		
		//pero si sos mas pro y queres usar un foreach
		for (int[] fila: arrayBi) {
			System.out.println();
			for (int x : fila) {
				System.out.print(x + " ");
			}
		}
	}
	
	public static void rellenarMatriz(int[][] arrayBi) {
		int x = 1;
		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 5; n++) {
				arrayBi[i][n] = x;
				x++;
			}
		}
	}

}
