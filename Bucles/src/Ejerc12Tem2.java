import java.util.Scanner;
public class Ejerc12Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int opc;
		
		do{
			System.out.println("===============================================\n"
					+ "--------------------TRIVIAL--------------------\n"
					+ "===============================================\n"
					//+ "P.1.: ¿Cómo se escribe 30 en Hexadecimal?\n"
					//+ "  1) 1E\n"
					//+ "  2) 1F\n"
					//+ "  3) 33\n"
					//+ "  4) Ninguno de los anteriores\n"
											+"\n/////////////////////////////////////////////////////////"
					+"\nP.2.: ¿Quién es el autor de la novela Ready Player One?\n"
					+ "  1) Douglas Capland\n"
					+ "  2) Isaac Asimov\n"
					+ "  3) Enerst CLine\n"
					+ "  4) Ray Bradburry"
					+ 	"\n/////////////////////////////////////////////////////////");
			opc = sc.nextInt();
		}while(opc<1 || opc>4);
		
		String respuesta = (opc == 3)?"¡Has acertado!":"Has fallado";
		sc.close();
		System.out.println(respuesta);
		System.exit(0);
	}
}
