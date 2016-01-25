
public class Ejercicio01 {

	public static void main(String[] args) {
		
		int arrayEdades[] = {20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19};
		boolean edadEncontrada = false;
		int i = 0;
		
		while(i<arrayEdades.length && edadEncontrada == false){
			if(arrayEdades[i]==35){
				edadEncontrada = true;
			}
			i++;
		}

		if(edadEncontrada == true){
			System.out.println("Se ha encontrado al menos una persona con 35 años");
		}
	}
}
