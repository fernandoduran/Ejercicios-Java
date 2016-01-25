
public class EjemploArrayBidimensional {

	public static void main(String[] args) {
		String arrayPrecios[][] = {
				{"Tablet Samsung","120"},
				{"Móvil Sony","115"},
				{"Ipad Mini","290"},
				{"Móvil HTC","95"}
			};
		
		float min, max, precio;
		int posMin = 0;
		int posMax = 0;
		
		for(int i = 0; i < arrayPrecios.length; i++){
			min = Float.parseFloat(arrayPrecios[posMin][1]);
			max = Float.parseFloat(arrayPrecios[posMax][1]);
			precio = Float.parseFloat(arrayPrecios[i][1]);
			
			if(precio<min){
				posMin = i;
			}
			
			if(precio>max){
				posMax = i;
			}
		}
		System.out.println("El precio menor es el de "+arrayPrecios[posMin][0]+" con un precio de "+arrayPrecios[posMin][1]+
				"€, y el precio mayor es el de "+arrayPrecios[posMax][0]+" con un precio de "+arrayPrecios[posMax][1]+"€");

	}

}
