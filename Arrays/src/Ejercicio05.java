public class Ejercicio05 {

	public static void main(String[] args) {

		/**
		 * 5.- Crea un array llamado notas con cinco posiciones y ve asignando a
		 * cada una de ellas el valor de un examen que hayas hecho este curso
		 * (no sólo de programación). Haz que después se muestren todos los
		 * valores mediante un bucle while.
		 */

		int notas[] = new int[5];

		notas[0] = 5;
		notas[1] = 6;
		notas[2] = 7;
		notas[3] = 8;
		notas[4] = 9;

		int i = 0;

		while (i < 5) {
			System.out.println(notas[i]);
			i++;
		}

	}

}