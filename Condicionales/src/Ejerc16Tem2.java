import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ejerc16Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		GregorianCalendar calendario = new GregorianCalendar();
		byte mes;
		int anyo;
		
		System.out.print("Introduce un número de mes: ");
		mes = sc.nextByte();
		System.out.print("Introduce un año: ");
		anyo = sc.nextInt();
		
		switch(mes){
		case 1:
			System.out.println("Enero, 31 días");
			break;
		case 2:
			if(calendario.isLeapYear(anyo)){
				System.out.println("Febrero tiene 29 días");
			}else{
				System.out.println("Febrero tiene 28 días.");
			}
			break;
		case 3:
			System.out.println("Marzo, 31 días");
			break;
		case 4:
			System.out.println("Abril, 30 días");
			break;
		case 5:
			System.out.println("Mayo, 31 días");
			break;
		case 6:
			System.out.println("Junio, 30 días");
			break;
		case 7:
			System.out.println("Julio, 31 días");
			break;
		case 8:
			System.out.println("Agosto, 31 días");
			break;
		case 9:
			System.out.println("Septiembre, 30 días");
			break;
		case 10:
			System.out.println("Octubre, 31 días");
			break;
		case 11:
			System.out.println("Noviembre, 30 días");
			break;
		case 12:
			System.out.println("Diciembre, 31 días");
			break;
		default:
			System.out.println("No es un més válido");
		}
		sc.close();
	}
}
