
public class EjemploAlgoritmoSeleccion3 {

	public static void main(String[] args) {
		int arrayEdades[] = {12, 43, 56, 23, 1, 63, 89, 102, 26, 22, 28};
		int posMin, aux;
		
		for(int i = 0; i < arrayEdades.length - 1; i++){
			posMin = i;
			
			for(int j = i + 1; j < arrayEdades.length; j++){
				if(arrayEdades[j] < arrayEdades[posMin]){
					posMin = j;
				}
			}
			
			aux = arrayEdades[i];
			arrayEdades[i] = arrayEdades[posMin];
			arrayEdades[posMin] = aux;
			
			for(int k = 0; k < arrayEdades.length; k++){
				System.out.println(arrayEdades[k] + " ");
			}
			System.out.println("---------------------------------------------------------------");
		}
	}
}
