import java.util.*;
public class Ejerc9Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float precio, precioFinal;
		int unidades;
		
		System.out.print("Dime el precio del producto que has comprado: ");
		precio = sc.nextFloat();
		
		System.out.print("Y dime cuantas unidades has comprado: ");
		unidades = sc.nextInt();
		precioFinal = precio * unidades;
		float dto15 = precioFinal - precioFinal*15/100;
		float dto10 = precioFinal - precioFinal*10/100;
		if(precioFinal < 100){
			
			System.out.println("No tienes derecho a descuento, el precio es de "+precioFinal+"€");
		}else if(precioFinal > 200){
			
			System.out.println("Tienes derecho derecho a un 15% de dto. Tu precio es de "+dto15+"€");
		}else if(precioFinal >100 || precioFinal < 200){
			
			System.out.println("Tienes derecho a un descuento del 10%. Tu precio es de "+dto10+"€");
		}
		sc.close();
	}
}
