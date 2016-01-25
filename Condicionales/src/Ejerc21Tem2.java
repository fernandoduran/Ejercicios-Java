import java.util.Scanner;

public class Ejerc21Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String dia;
		String hora;

		System.out.println("Día: ");
		dia = entrada.nextLine();

		hora = (dia.equals("entre semana")) ? "20:00" : "14:00";

		System.out.println("Hora de cierre: " + hora);
		entrada.close();
	}
}
