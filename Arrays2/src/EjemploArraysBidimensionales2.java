import java.util.Scanner;
public class EjemploArraysBidimensionales2 {

	public static void main(String[] args) {
		/*
		 * Programa que pida por consola los datos de tres alumnos y sus edades.
		 * A continuación mostrará la media de edad de los alumnos.
		 */
		
		String arrayDatosAlumnos[][] = new String[3][4];
		float edadAlu1 = 0, edadAlu2 = 0, edadAlu3 = 0, mediaEdad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====================Datos alumnos====================\n");
		for(int i = 0; i < arrayDatosAlumnos.length; i++){
			System.out.print("\tIntroduce el nombre del/la alumno/a "+i+": ");
			arrayDatosAlumnos[i][0] = sc.next();
			
			System.out.print("\tIntroduce el primer apellido del/la alumno/a "+i+": ");
			arrayDatosAlumnos[i][1] = sc.next();
			
			System.out.print("\tIntroduce el segundo apellido del/la alumno/a "+i+": ");
			arrayDatosAlumnos[i][2] = sc.next();
			
			System.out.print("\tIntroduce la edad del/la alumno/a "+i+": ");
			arrayDatosAlumnos[i][3] = sc.next();
			System.out.println("=====================================================\n");
		}
		
		for(int i = 0; i< arrayDatosAlumnos.length; i++){
			edadAlu1 = Integer.parseInt(arrayDatosAlumnos[i][3]);
			edadAlu2 = Integer.parseInt(arrayDatosAlumnos[i][3]);
			edadAlu3 = Integer.parseInt(arrayDatosAlumnos[i][3]);
		}
		System.out.println("======Calculo de la media de edad de los alumnos======\n");
		System.out.println("La media de edad de los alumnos es "+(mediaEdad = (edadAlu1 + edadAlu2 + edadAlu3)/3));
		sc.close();
	}
}
