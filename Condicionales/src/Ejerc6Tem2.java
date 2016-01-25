import java.util.*;
public class Ejerc6Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String producto;
		float precio, precioFinal;
		byte unidades;
		
		System.out.print("Indicame el producto que vas a comprar: ");
		producto = sc.nextLine();
		
		System.out.print("Ahora indicame su precio: ");
		precio = sc.nextFloat();
		
		System.out.print("Por último dime cuantos vas a comprar: ");
		unidades = sc.nextByte();
		
		if(precio >= 75){
			
			precioFinal = precio - (precio*15/100);
			System.out.print("El precio total de "+producto+" habiéndole aplicado un descuento del 15% es de "+precioFinal+"€");
		}
		else{
			precioFinal = precio - (precio*5/100);
			System.out.print("El precio total de "+producto+" habiéndole aplicado un descuento del 5% es de "+precioFinal+"€");
		}
		sc.close();
	}
}
