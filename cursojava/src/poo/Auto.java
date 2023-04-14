package poo;
//import java.util.*;

public class Auto {
	/*el uso de la palabra static hace referencia a que es un solo atributo para todos
	 * los objetos que queramos instanciar, es decir, que este atributo ya no le 
	 * pertenece a cada objeto, sino que le pertenece a la clase.
	 * Si un metodo tiene la palabra static, este no actua sobre objetos ni puede 
	 * acceder a variables ni constantes declaradas en la clase (a menos que sean static)
	 */
	//private int id;
	//private static int idSiguiente = 1;
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	//private int cant_asientos;
	private boolean aire_acondicionado, asientos_cuero;
	private int peso_total;
	//private Date fecha_creacion;
	
	public Auto() {
		ruedas = 4; largo = 2000; ancho = 300; motor = 1600; peso_plataforma = 500;
	}
	
	public String getDatosPlataforma() {
		return "Ruedas: " + ruedas + "\nLargo: " + largo/1000 + "m\nAncho: " + ancho + "cm\nMotor: " + motor + "cm3\nPeso de la plataforma: " + peso_plataforma + "kg";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	/*public void setCantAsientos(int cant_asientos) {
		this.cant_asientos = cant_asientos;
	}
	
	public int getCantAsientos() {
		return cant_asientos;
	}*/
	
	public void setAireAcondicionado(String aire_acondicionado) {
		if (aire_acondicionado.equalsIgnoreCase("si")) this.aire_acondicionado = true;
		else this.aire_acondicionado = false;
	}
	
	public boolean getAireAcondicionado() {
		return aire_acondicionado;
	}
	
	public void setAsientosCuero(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) this.asientos_cuero = true;
		else this.asientos_cuero = false;
	}
	
	public boolean getAsientosCuero() {
		return asientos_cuero;
	}
	
	public void setPesoTotal() {
		peso_total += peso_plataforma;
		if (aire_acondicionado) peso_total += 20;
		if (asientos_cuero) peso_total += 50;
	}
	
	public int getPesoTotal() {
		this.setPesoTotal();
		return peso_total;
	}
	
	/*public void setFechaCreacion(int ano, int mes, int dia) {
		GregorianCalendar fecha = new GregorianCalendar(ano, mes-1, dia);
		this.fecha_creacion = fecha.getTime();
	}
	
	public Date getFechaCreacion() {
		return fecha_creacion;
	}*/
}
