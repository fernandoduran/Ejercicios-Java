
public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arrayTemperaturas[] = {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		double media = 0;
		int i, j;
		int veces12 = 0;
		for(i = 0; i < arrayTemperaturas.length; i++){
			media = media + arrayTemperaturas[i];
		}
		System.out.println(media/arrayTemperaturas.length);
		
		for(j = 0; j < arrayTemperaturas.length; j++){
			if(arrayTemperaturas[j] > 12){
				veces12++;
			}
		}
		System.out.println(veces12);
	}
}
