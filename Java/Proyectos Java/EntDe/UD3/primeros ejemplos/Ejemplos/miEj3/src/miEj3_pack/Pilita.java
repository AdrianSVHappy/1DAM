package miEj3_pack;

public class Pilita {

	private Object datos [];
	
	public Pilita() {
		this.datos = null;
	}
	
	public void apilar(Object elemento) {
		if (this.datos == null) {
			this.datos = new Object[1];
			this.datos[0] = elemento;
		} else {
			Object datosAux[] = new Object[datos.length+1];
			for(int i=1; i < datos.length; i++ ) {
				datosAux[i] = datos[i];
			}
			datosAux[datos.length-1] = elemento;
			datos = datosAux;
		}		
	}
	
	public boolean esPilaVacia() {
		boolean resultado;
		
		if(this.datos == null || datos.length == 0) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}
	
	public Object Cima() {
		return datos[datos.length-1];
	}
	
	public Object desApilar() {
		Object resultado = null;
		Object datosAux[];
		try {
				if (this.datos == null) {
					throw new Exception("La pila está vacía");
				} else {
					resultado = datos[datos.length-2] ;
					datosAux = new Object[datos.length-1];
					for(int i=0; i < datos.length-1; i++ ) {
						datosAux[i] = datos[i];
					}
					datos = datosAux;
				}
			} catch (Exception e) {
				System.out.println("ERROR: "+e.getMessage());
			}		
		
		return resultado;
	}
}
