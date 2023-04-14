package poo;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj reloj = new Reloj();
		reloj.empezar(3000, true);
		JOptionPane.showMessageDialog(null, "Pulse aceptar para cortar el programa");
		System.exit(0);
		
	}

}

class Reloj {
	
	/*public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	}*/
	
	// para que la local inner class acceda a las variables locales, debemos indicar la palabra final
	public void empezar(int intervalo, final boolean sonido) {
		// clase interna local --> solo si la clase se instancia una unica vez
		// encapsulamos mas el codigo --> la clase reloj no puede acceder a ella
		// tambien puede acceder a las variables locales
		class MostrarHora2 implements ActionListener {
			
			public void actionPerformed(ActionEvent event) {
				Date ahora = new Date();
				// La propiedad "sonido" esta definida en la otra clase
				if (sonido) Toolkit.getDefaultToolkit().beep();
				System.out.println("La hora es: " + ahora);
			}
			
		}		
		ActionListener listener = new MostrarHora2();
		Timer temporizador = new Timer(intervalo, listener);
		temporizador.start();
	}
	
	//private int intervalo;
	//private boolean sonido;
	
	// Inner class --> la clase interna puede acceder a las propiedades de la clase que la engloba aunque sean private
	// Podemos ahorrarnos crear los metodos de acceso (getters y setters)
	/*private class MostrarHora2 implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			Date ahora = new Date();
			// La propiedad "sonido" esta definida en la otra clase
			if (sonido) Toolkit.getDefaultToolkit().beep();
			System.out.println("La hora es: " + ahora);
		}
		
	}*/
	
}
