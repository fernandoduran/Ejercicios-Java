import java.util.*;
public class Ejerc13Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		byte mes;
		System.out.print("Introduce un número de mes: ");
		mes = sc.nextByte();
		if(mes >= 1 && mes <= 4){
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
		}else{
			System.out.println("No es un mes correcto");
		}
		sc.close();
	}
}
