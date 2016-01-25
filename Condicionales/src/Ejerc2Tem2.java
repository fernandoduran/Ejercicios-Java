import java.util.*;
public class Ejerc2Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio, precioFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Precio: ");
		precio = sc.nextInt();
		precioFinal = precio;
		
		if (precio > 80){
			precioFinal = precio - (precio *10/100);
		}
		System.out.print("Precio final: " +precioFinal);
		sc.close();
	}
}
