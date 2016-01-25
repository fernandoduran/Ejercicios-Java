
public class Ejercicio09 {

	public static void main(String[] args) {
		
		int arrayPrecios[] = {43, 58, 44, 62, 80, 15, 15, 10, 90, 56};//Array de números a ordenar
		int posMin;//Almacenará la posición del menor elemento del subarray
		int aux;//Variable hacer el intercambio de valores
		
		for(int i = 0; i <= arrayPrecios.length-2; i++){
			
			//Buscamos la posición del elemento más pequeño entre i y n-1.
			posMin = i;
			for(int j=i; j<arrayPrecios.length; j++){
				if(arrayPrecios[j]<arrayPrecios[posMin]){
					posMin = j;
				}
			}
			//Ahora posMin es la posición del mínimo elemento del array (entre i y el final del array)
			//Intercambiamos las posiciones i y posMin.
			aux = arrayPrecios[i];
			arrayPrecios[i] = arrayPrecios[posMin];
			arrayPrecios[posMin] = aux;
			
			/*
			 * Para ver qué hace el algortimo iremos mostrando el array en cada paso. Mostramos el array ya ordenado
			 */
			for(int k=0; k<arrayPrecios.length; k++){
				System.out.println(arrayPrecios[k]);
			}
			System.out.println("-------------------------------------------------");
		}
	}
}
