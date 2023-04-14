package cursojava;
//import javax.swing.*;

public class Arrays {

	public static void main(String[] args) {
		//un array se declara igual que en C#
		//int[] vecNum = new int[10];
		int[] vecNum2 = {1, 2, 3, 4, 5};
		
		/*el foreach en java es un for
		 * asi como en C# se declara un item con el tipo de dato que corresponda al array
		 * en vez de utilizar la palabra reservada "in", se utilizaran ":" para referirse al array
		 */
		for (int item:vecNum2) {
			System.out.println(item);
		}
		
		/*int num = ingresarNum("Ingrese un numero: ");
		System.out.println(num);*/
	}
	
	/*public static int ingresarNum(String msg) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(msg));
		return num;
	}*/

}
