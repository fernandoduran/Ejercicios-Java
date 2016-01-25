import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arrayInstrucciones[] = new String[1000];
		Scanner sc = new Scanner(System.in);
		int i;
		
		for(i = 0; i < arrayInstrucciones.length; i++){
			System.out.println("Introduce en que dirección debe ir el robot:");
			arrayInstrucciones[i] = sc.next().toLowerCase();
			
			if(arrayInstrucciones[i].equals("ejecutar")){
				break;
			}
		}
		
		System.out.println("\nLista de ordenes");
		System.out.println("================");
		
		int j = 0;
		
		while(!arrayInstrucciones[j].equals("ejecutar")){
			System.out.println("Orden nº " +(j + 1)+ ": " +arrayInstrucciones[j]);
			j++;
		}
		sc.close();
	}
}
