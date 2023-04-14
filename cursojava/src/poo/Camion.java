package poo;

/*para que una clase herede las propiedades y metodos de otra, se utiliza la palabra "extends"
 *Esto hace que "Auto" sea una SUPERclase/clase padre, mientras que "Camion", una SUBclase/clase hijo
 *Java no permite la herencia multiple*/
public class Camion extends Auto {
	private int capacidad_carga;
	private int lugares_extra;
	
	public Camion(int lugares_extra, int capacidad_carga) {
		super();	//esta instruccion llama al constructor de la superclase/clase padre
		this.capacidad_carga = capacidad_carga;
		this.lugares_extra = lugares_extra;
	}
	
	public String getDatosCamion() {
		return "La capacidad de carga es " + capacidad_carga + " y tiene " + lugares_extra + " lugares extra";
	}
}
