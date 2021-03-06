import java.util.Scanner;
public class EjemploArraysBidimensionales3 {

	public static void main(String[] args) {
		/*
		 * Programa que lea el nombre y precio de tres artículos y los actualice añadiéndoles el 21% del IVA a todos.
		 * Finalmente mostrará una lista con los nombres y precios actualizados de todos.
		 */
		Scanner sc = new Scanner(System.in);
		
		String arrayPreciosIVA[][]= new String[3][2];
		float precio = 0;
		double IVA = 0.21;
		
		System.out.println("====================Calculador de la compra====================\n");
		for(int i = 0; i < arrayPreciosIVA.length; i++){
			System.out.print("\tIntroduce el nombre del producto "+i+": ");
			arrayPreciosIVA[i][0] = sc.nextLine();
			
			System.out.print("\tIntroduce el precio del producto "+i+":\n ");
			precio = Float.parseFloat(sc.next());
			precio  = (float) (precio * IVA) + precio;
			
			arrayPreciosIVA[i][1] = String.valueOf(precio);
			System.out.println("========================================================\n");
		}
		System.out.println("====================Lista de precios====================\n");
		
		for(int i = 0; i < arrayPreciosIVA.length; i++){
			System.out.println("El artículo "+arrayPreciosIVA[i][0]+" es de "+arrayPreciosIVA[i][1]+"€");
		}
		sc.close();
	}
}
