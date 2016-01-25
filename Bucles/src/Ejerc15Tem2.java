import java.util.*;
public class Ejerc15Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int precio = 0;
		
		for(int i = 1; i<=4; i++){
			System.out.println("Dime el precio de un producto");
			precio = sc.nextInt() + precio;
		}
		System.out.println("El precio total de los cuatro productos es " +precio);
		sc.close();
	}
}
