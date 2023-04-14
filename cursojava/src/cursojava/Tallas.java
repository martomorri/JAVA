package cursojava;

import java.util.*;

public class Tallas {
	
	enum Talla {
		
		SMALL("S"), MEDIUM("M"), LARGE("L");
		
		private Talla (String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;

	}

	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese un talle (SMALL, MEDIUM, LARGE): ");
		String talla = input.next().toUpperCase();
		Talla talle = Enum.valueOf(Talla.class, talla);
		System.out.println("Talle: " + talle + " (" + talle.getAbreviatura() + ")");
		
	}

}
