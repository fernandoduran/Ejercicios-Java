import java.util.Scanner;

public class Ejerc17Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.print("Introduce un numero entre 1 y 10: ");
		
		if(sc.hasNextInt()==true){
			numero = sc.nextInt();
			if(numero>= 1 && numero<=10){
				System.out.println("Número correcto");
			} else {
				System.out.println("El número está fuera de rango");
			}
		} else{
			System.out.println("Valor incorrecto, no es un entero");
		}
		sc.close();


	}

}
