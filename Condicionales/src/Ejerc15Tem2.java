import java.util.*;
public class Ejerc15Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		byte mes;
		
		System.out.print("Introduce un n�mero de mes: ");
		mes = sc.nextByte();
		switch(mes){
		case 1:
			System.out.println("Enero, 31 d�as");
			break;
		case 2:
			System.out.println("Febrero, 28 d�as");
			break;
		case 3:
			System.out.println("Marzo, 31 d�as");
			break;
		case 4:
			System.out.println("Abril, 30 d�as");
			break;
		case 5:
			System.out.println("Mayo, 31 d�as");
			break;
		case 6:
			System.out.println("Junio, 30 d�as");
			break;
		case 7:
			System.out.println("Julio, 31 d�as");
			break;
		case 8:
			System.out.println("Agosto, 31 d�as");
			break;
		case 9:
			System.out.println("Septiembre, 30 d�as");
			break;
		case 10:
			System.out.println("Octubre, 31 d�as");
			break;
		case 11:
			System.out.println("Noviembre, 30 d�as");
			break;
		case 12:
			System.out.println("Diciembre, 31 d�as");
			break;
		default:
			System.out.println("No es un m�s v�lido");
		}
		sc.close();
	}
}
