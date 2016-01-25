import java.util.*;
public class Ejerc8Tem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String respuesta;
		
		System.out.print("¿Como se dice ordenador en inglés?: ");
		respuesta = sc.nextLine();
		
		if(respuesta.equals("computer")){
			System.out.println("Has a certado, ¡enhorabuena!");
		}else{
			System.out.println("tranquilo, sigue intentándolo que seguro lo consigues");
		}
		sc.close();
	}
}
