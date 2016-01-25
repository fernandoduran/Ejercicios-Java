import java.util.Scanner;

/**
 * @author Fernando Duran Ruiz
 */
public class Ejercicio03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int suma, resultado;
		Scanner sc = new Scanner(System.in);
		int numAle1, numAle2;
		
		while(true){
			numAle1 = (int) (Math.random()*100+1);
			numAle2 = (int) (Math.random()*100+1);
			resultado = numAle1 + numAle2;
			
			System.out.println("Dime el resultado de sumar " +numAle1+ " y " +numAle2+ ": ");
			suma = sc.nextInt();
			
			String result = (suma == resultado)?"Has acertado la suma, llevas " +i+ " acierto(s)":"Suma incorrecta";
			System.out.println(result);
			i++;
		}
	}
}
