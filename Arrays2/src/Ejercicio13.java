
public class Ejercicio13 {

	public static void main(String[] args) {
		// Se guardan los datos en un array bidimensional llamado medidas.

        double medidas[][] = { { 8.5, 1020, 40 }, { 14.2, 1021, 35 },
                { 11, 1022, 45 }, { 7, 1023, 50 } };

        // A continuación, se muestran estas medidas fila a fila:

        System.out.println("Registros meteorológicos \n"
                + "========================");
        for (int i = 0; i < medidas.length; i++) {
            System.out.println(medidas[i][0] + "\t" + medidas[i][1] + "\t  "+ medidas[i][2]);
        }
	}
}
