
public class EjemploOperaciones {

	public static void main(String[] args) {
		// Creamos un array con los 200 primeros numeros pares
		
		int arrayPares[] = new int[200];
		int i;
		
		for(i = 0; i < arrayPares.length; i++){
			arrayPares[i] = 2*i;
			System.out.println(arrayPares[i]);
		}
		
		//Calculamos la suma de estos 200 números pares
		int suma = 0;
		
		for(i = 0; i < arrayPares.length; i++){
			suma = suma + arrayPares[i];
		}
		

	}

}
