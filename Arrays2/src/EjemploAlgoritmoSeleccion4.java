
public class EjemploAlgoritmoSeleccion4 {

	public static void main(String[] args) {
		double arrayAlturas[] = {1.60, 1.3, 1.72, 1.80, 1.91};
		int posMin;
		double aux;
		
		for(int i = 0; i < arrayAlturas.length - 1; i++){
			posMin = i;
			
			for(int j = i + 1; j < arrayAlturas.length; j++){
				if(arrayAlturas[j] < arrayAlturas[posMin]){
					posMin = j;
				}
			}
			
			aux = arrayAlturas[i];
			arrayAlturas[i] = arrayAlturas[posMin];
			arrayAlturas[posMin] = aux;
			
			for(int k = 0; k < arrayAlturas.length; k++){
				System.out.println(arrayAlturas[k] + " ");
			}
			System.out.println("---------------------------------------------------------------");
		}

	}

}
