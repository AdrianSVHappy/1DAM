package miEj3_pack;

import java.util.*;

public class UsaPilita {

	public static void main(String[] args) {
		
		Pilita p = new Pilita();
		int aux;
				
		Scanner leeTeclado = new Scanner(System.in);
		System.out.println("Escriba un número que apilar: ");
		aux = leeTeclado.nextInt();
		while (aux != 0) {
			p.apilar(aux);
			aux = leeTeclado.nextInt();
		}
		
		System.out.println("Sacando objetos de la pila.");
		System.out.println("El primero de la cima (1): " + p.desApilar());
		System.out.println("El primero de la cima (2): " + p.desApilar());
		System.out.println("El primero de la cima (3): " + p.desApilar());
	
	}

}
