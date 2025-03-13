package miEj2_pack;

public class Persona {

	private String nombre;
	private int edad;
	
	//Constructor
	public Persona(String parametroNombre, int parametroEdad) {
		this.nombre = parametroNombre;
		this.edad = parametroEdad;
	}
	
	//Metodos
	//*Saludar
	public void saludar() {
		System.out.println("Hola soy "+this.nombre+" y tengo "+this.edad+" años.");
	}
	
	//*GetNombre
	public String getNombre() {
		return this.nombre;
	}
	
}
