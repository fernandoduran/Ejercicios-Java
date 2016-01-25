
public class Ejercicio12 {

	public static void main(String[] args) {
		int[] numA = { 8, 2, 10, 20, 12, 71, 15, 23 };

		int posMin;
		int aux;

		for (int i = 0; i < numA.length; i++) {

			posMin = i;

			for (int j = i + 1; j < numA.length; j++) {
				if (numA[j] < numA[posMin]) {
					posMin = j;
				}
			}

			aux = numA[i];
			numA[i] = numA[posMin];
			numA[posMin] = aux;

			for (int k = 0; k < numA.length; k++) {
				System.out.println(numA[k]);
			}
			System.out.println("------");
		}
		System.out.println("Menor número atómico: "+numA[0]);
		System.out.println("Mayor número atómico: "+numA[numA.length - 1]);
	}
}
