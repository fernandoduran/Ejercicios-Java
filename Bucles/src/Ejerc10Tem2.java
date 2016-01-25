import java.util.Scanner;
public class Ejerc10Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opc = 0;
		
		while(opc < 1 || opc > 4){
			System.out.println("--------------------TRIVIAL--------------------\n"
					+ "P.1.: ¿Cómo se escribe 30 en Hexadecimal?\n"
					+ "  1) 1E\n"
					+ "  2) 1F\n"
					+ "  3) 33\n"
					+ "  4) Ninguno de los anteriores");
			opc = sc.nextInt();
		}
		String opcion = (opc == 1)?"¡Has acertado!":"Sigue intentandolo";
		sc.close();
		System.out.println(opcion);
	}
}
