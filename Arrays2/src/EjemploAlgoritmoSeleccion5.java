
public class EjemploAlgoritmoSeleccion5 {

	public static void main(String[] args) {
		double arrayPrecios[] = {340.65, 123.22, 1865.41, 3.25, 1.80};
		int posMin;
		double aux;
		
		for(int i = 0; i < arrayPrecios.length - 1; i++){
			posMin = i;
			
			for(int j = i + 1; j < arrayPrecios.length; j++){
				if(arrayPrecios[j] < arrayPrecios[posMin]){
					posMin = j;
				}
			}
			
			aux = arrayPrecios[i];
			arrayPrecios[i] = arrayPrecios[posMin];
			arrayPrecios[posMin] = aux;
			
			for(int k = 0; k < arrayPrecios.length; k++){
				System.out.println(arrayPrecios[k] + " ");
			}
			System.out.println("---------------------------------------------------------------");
		}
	}
}