import java.util.*;
public class Ejerc10Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		byte nota;
		
		System.out.print("Introduce una nota entre 0 y 10: ");
		nota = sc.nextByte();
		
		if(nota >= 0 && nota < 5){
			System.out.println("Insuficiente");
		}else if(nota == 5){
			System.out.println("Suficiente");
		}else if(nota == 6){
			System.out.println("Bien");
		}else if(nota == 7 || nota == 8){
			System.out.println("Notable");
		}else{
			System.out.println("Excelente");
		}
		sc.close();
	}
}
