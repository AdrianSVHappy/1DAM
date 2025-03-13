package miEj1_pack;

import java.util.Scanner;

public class MiEj1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String leido;
		
		System.out.println("Hola Mundo");
		
		Scanner leeTeclado = new Scanner(System.in);
		System.out.print("Escriba su nombre: ");
		leido = leeTeclado.nextLine();
		System.out.println(leido + ", bonito nombre");
		
	}

}
