import java.util.Scanner;

public class Ejerc15aTem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		byte opc;
		float result;
		
		System.out.print("Dime dos números: ");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();
		
		System.out.println("Elige una opción: \n 1) Sumar \n 2) Restar \n 3) Multiplicar \n 4) Dividir");
		opc = sc.nextByte();
		
		switch(opc){
		case 1:
			result = num1 + num2;
			System.out.println("El resultado es: "+result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("El resultado es: "+result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("El resultado es: "+result);
			break;
		case 4:
			result = num1 / num2;
			System.out.println("El resultado es: "+result);
			break;
		default:
			System.out.println("Opción no válida");
			System.exit(opc);
		}
		sc.close();
	}
}
