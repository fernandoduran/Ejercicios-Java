import java.util.*;
public class Ejerc21Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		
		for(int i = 1; i <= 5; i++){
			System.out.println("Dime un numero: ");
			numero = sc.nextInt();
			if(numero == 1){
				System.out.println("No seas tonto");
				continue;
			}else{
				System.out.println("-------------------------------\n"
									+"Tabla del " +numero+ "\n"
									+ "-------------------------------\n");
				for(int j = 1; j <= 10; j++){
					System.out.println(numero + " x "+ j + " = " +numero*j);
					}
				}
			System.out.println();
		}
		sc.close();
	}
}
