import java.util.*;
public class Ejerc5Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		byte mes;
		
		System.out.print("Introduce un número de mes: ");
		mes = sc.nextByte();
		
		if(mes >=1 && mes<=12){
			System.out.println("Mes válido");
		}
		else{
			System.out.println("Mes no válido");
		}
		sc.close();
	}
}
