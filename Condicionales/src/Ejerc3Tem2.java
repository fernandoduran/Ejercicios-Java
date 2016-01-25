import java.util.*;
public class Ejerc3Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio, precioFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Precio: ");
		precio = sc.nextInt();
		precioFinal = precio;
		
		if (precio < 5){
			precioFinal = precio + 2;
		}
		System.out.print("Precio final: " +precioFinal);
		sc.close();
	}
}
