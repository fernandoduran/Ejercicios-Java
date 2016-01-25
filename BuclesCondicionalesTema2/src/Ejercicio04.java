import java.util.Scanner;

/**
 * @author Fernando Duran Ruiz
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		int suma, resultado;
		Scanner sc = new Scanner(System.in);
		int numAle1, numAle2;
		char letra;
		
		while(true){
			numAle1 = (int) (Math.random()*100+1);
			numAle2 = (int) (Math.random()*100+1);
			resultado = numAle1 + numAle2;
			
			System.out.println("Dime el resultado de sumar " +numAle1+ " y " +numAle2+ ": ");
			suma = sc.nextInt();
			
			String result = (suma == resultado)?"Has acertado la suma, llevas " +i+ " acierto(s)":"Suma incorrecta";
			System.out.println(result);
			System.out.println("¿Quieres continuar S/N?");
			letra = sc.next().charAt(0);
			i++;
			if(letra == 's'){
				continue;
			} else {
				System.out.println("Gracias por participar");
				break;
			}
		}
		sc.close();
	}
}
