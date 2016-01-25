import java.util.Scanner;

public class Ejercicio12ConWhile {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        
        while(opc<1 || opc>4){
            System.out.println("===============================================\n"
                    + "--------------------TRIVIAL--------------------\n"
                    + "===============================================\n"
                    +"\n/////////////////////////////////////////////////////////"
                    +"\nP.2.: ¿Quién es el autor de la novela Ready Player One?\n"
                    + "  1) Douglas Capland\n"
                    + "  2) Isaac Asimov\n"
                    + "  3) Enerst CLine\n"
                    + "  4) Ray Bradburry"
                    + "\n/////////////////////////////////////////////////////////");
            opc = sc.nextInt();
        }
        
        String respuesta = (opc == 3)?"¡Has acertado!":"Has fallado";
        
        sc.close();
        System.out.println(respuesta);

    }

}