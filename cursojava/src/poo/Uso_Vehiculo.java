package poo;
//import javax.swing.*;
//import java.time.*;
//import java.time.format.DateTimeFormatter;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		/*Auto renault = new Auto();
		System.out.println(renault.getDatosPlataforma());
		renault.setColor(JOptionPane.showInputDialog("Ingrese el color:"));
		System.out.println("Color: " + renault.getColor());
		renault.setAsientosCuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		if (renault.getAsientosCuero()) {
			System.out.println("Asientos: Cuero");
		} else System.out.println("Asientos: Serie");
		renault.setAireAcondicionado(JOptionPane.showInputDialog("¿Tiene aire acondicionado?"));
		System.out.println("Peso Total: " + renault.getPesoTotal() + "kg");
		int ano, mes, dia;
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en que se creo:"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes en que se creo:"));
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia en que se creo:"));
		renault.setFechaCreacion(ano, mes, dia);
		//DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Fecha de creacion: " + renault.getFechaCreacion());*/
		
		Auto auto1 = new Auto();
		auto1.setColor("Rojo");
		Camion camion1 = new Camion(7, 580);
		camion1.setColor("Amarillo");
		camion1.setAsientosCuero("si");
		camion1.setAireAcondicionado("si");
		System.out.println("Auto:\n" + auto1.getDatosPlataforma());
		System.out.println("Camion:\n" + camion1.getDatosPlataforma() + "\n" + camion1.getDatosCamion());
	}

}
