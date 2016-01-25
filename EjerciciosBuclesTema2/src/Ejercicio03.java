/**
 * @author Fernando Duran Ruiz
 *
 */
public class Ejercicio03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;//Contador
		double result = 0;//Variable que almacenar� el resultado
		
		//Bucle while que saca las potencias de 3 entre 1 y 1200.
		do{
			System.out.println("Exponente: " +(i-1)+ "\nresultado potencia: " +result);
			result = Math.pow(3, i);
			i++;
		}while(result<=12000);
	}

}
