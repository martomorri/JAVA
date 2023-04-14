package cursojava;
//import java.util.*;
import javax.swing.*;

public class Prueba {

	public static void main(String[] args) {
		/*
		//Ejemplo input con clase Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nombre = input.nextLine();
		System.out.println("Hola, " + nombre);
		
		//Ejemplo input con clase JOptionPane
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
		String edad_usuario = JOptionPane.showInputDialog("Ingrese su edad:");
		int edad = Integer.parseInt(edad_usuario);
		System.out.println("Hola " + nombre + ". El año que viene vas a tener " + (edad+1) + " años");*/
		
		/*Ejemplo format number
		 * Con el metodo printf, se le indica "%1.cantDeNumDecimales + f"
		 * y como segundo parametro el numero a formatear
		 */
		String num = JOptionPane.showInputDialog("Ingrese un numero:");
		double num1 = Double.parseDouble(num);
		double raiz = Math.sqrt(num1);
		System.out.print("La raiz cuadrada de " + num1 + " es ");
		System.out.printf("%1.2f", raiz);
	}

}
