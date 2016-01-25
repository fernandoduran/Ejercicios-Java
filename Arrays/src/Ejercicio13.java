
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double arrayPotencias[] = new double[20];
		int i;
		
		for(i = 0; i < arrayPotencias.length; i++){
			arrayPotencias[i] = Math.pow(2, i);
		}
		
		i = 0;
		while(i < arrayPotencias.length){
			System.out.println(arrayPotencias[i]);
			i++;
		}
	}
}
