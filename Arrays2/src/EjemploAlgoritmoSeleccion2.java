
public class EjemploAlgoritmoSeleccion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrayNotas[]={4, 7, 10, 9, 2, 8, 8, 1};
		int posMin;
		int aux;
		
		for(int i = 0; i < arrayNotas.length -1; i++){
			
			/*
			 * Buscar la posición del elemento más pequeño en el subarray 
			 * desde i hasta el final
			 */
			posMin = i;
			for(int j =i+1; j<arrayNotas.length; j++){
				if(arrayNotas[j] < arrayNotas[posMin]){
					posMin = j;
				}
			}
			
			/*
			 * Intercambiar la posición de ese elemento más perqueño por la
			 * posición en la que estamos ahora (i), es decir intercambiaremos
			 * la posición posMin por i
			 */
			aux = arrayNotas[posMin];
			arrayNotas[posMin] = arrayNotas[i];
			arrayNotas[i] = aux;
			/*
			 * La i aumentará en 1 y se volverá a empezar has llegar al
			 * penúltimo elemento del array.
			 */
			for(int k=0; k<arrayNotas.length; k++){
				System.out.println(arrayNotas[k]);
			}
			System.out.println("-----------------");
			
		}

	}

}
