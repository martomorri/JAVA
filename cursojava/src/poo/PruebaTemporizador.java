package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		
		ActionListener listener = new MostrarHora();
		Timer temporizador = new Timer(5000, listener);
		temporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		System.exit(0);		// Detiene la ejecucion del programa
		
	}

}

class MostrarHora implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		Toolkit.getDefaultToolkit().beep();
		System.out.println("La hora es: " + ahora);
	}
	
}
