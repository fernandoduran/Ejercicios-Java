import java.util.*;
public class Ejerc12Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		byte mes;
		System.out.print("Introduce un n�mero de mes: ");
		mes = sc.nextByte();
		
		if(mes == 1){
			System.out.println("Enenro");
		}else if(mes == 2){
			System.out.println("Febrero");
		}else if(mes == 3){
			System.out.println("Marzo");
		}else if(mes == 4){
			System.out.println("Abril");
		}else{
			System.out.println("Otro mes");
		}
		sc.close();
	}
}
