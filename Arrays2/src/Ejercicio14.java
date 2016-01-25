
public class Ejercicio14 {
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
		}
}
