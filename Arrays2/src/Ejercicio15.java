
public class Ejercicio15 {

	public static void main(String[] args) {
		String precios[][] = {
				{"Tablet Samsung","120"},
				{"Móvil Sony","115"},
				{"Ipad Mini","290"},
				{"Móvil HTC","95"}
			};
			float total = 0;
			 
			System.out.println("Artículos");
			System.out.println("=======================");
			 
			for(int i=0; i<precios.length; i++){
				System.out.println(precios[i][0] + "\t" + precios[i][1]);
				float numFloat=Float.parseFloat(precios[i][1]);
				total = total + numFloat;
			}
			System.out.println();
			System.out.println("Total: " + total + " €");
			
			int posMin = 0;
			int posMax = 0;
			float min, max, precio;
			
			for(int i = 0; i < precios.length; i++){
				min = Float.parseFloat(precios[posMin][1]);
				max = Float.parseFloat(precios[posMax][1]);
				precio = Float.parseFloat(precios[i][1]);

				if(precio<min){
					posMin = i;
				}
				
				if(precio>max){
					posMax = i;
				}
			}
			System.out.println("El precio menor es el "+precios[posMin][0]+" que vale "+precios[posMin][1]+" y el precio máximo es el "
					+precios[posMax][0]+" que vale "+precios[posMax][1]);
	}
}
