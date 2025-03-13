package miEj2_pack;

public class ProbandoPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear instancias de la clase persona
		Persona persona1 = new Persona("Juan", 50);
		Persona persona2 = new Persona("Susana", 25);
		
		//Saludamos a las personas
		persona1.saludar();
		persona2.saludar();
		
		
		System.out.println("Mi nombre es: "+persona1.getNombre());
		
	}

}
