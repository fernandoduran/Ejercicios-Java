import java.util.*;
public class Ejerc4Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int contrasenya;
		
		System.out.print("Intduce una contraseña");
		contrasenya = sc.nextInt();
		
		if(contrasenya == 1234){
			System.out.println("Acceso concedido");
		}
		sc.close();
	}
}
