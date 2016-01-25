
public class EjemploAlgoritmoSeleccion {

	public static void main(String[] args) {
		
		int arrayValores[] = {4, 9, 30, -1, 5, 8};//Array de números a ordenar
		int posMin;//Almacenará la posición del menor elemento del subarray
		int aux;//Variable hacer el intercambio de valores
		
		for(int i = 0; i <= arrayValores.length-2; i++){
			
			//Buscamos la posición del elemento más pequeño entre i y n-1.
			posMin = i;
			for(int j=i; j<arrayValores.length; j++){
				if(arrayValores[j]<arrayValores[posMin]){
					posMin = j;
				}
			}
			//Ahora posMin es la posición del mínimo elemento del array (entre i y el final del array)
			//Intercambiamos las posiciones i y posMin.
			aux = arrayValores[i];
			arrayValores[i] = arrayValores[posMin];
			arrayValores[posMin] = aux;
			
			/*
			 * Para ver qué hace el algortimo iremos mostrando el array en cada paso. Mostramos el array ya ordenado
			 */
			for(int k=0; k<arrayValores.length; k++){
				System.out.println(arrayValores[k]);
			}
			System.out.println("-------------------------------------------------");
		}		
	}
}
