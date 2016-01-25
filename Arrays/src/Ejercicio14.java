
public class Ejercicio14{
     
    public static void main(String[] args){
 
        int[] primo = new int[100];
        primo[0] = 2;
        primo[1] = 3;
        int i = 3;
        boolean primos;
        int k;
        int j = 1;
        
        while(j<primo.length){
            primos = true;
            
            for(k = 0;k<j;k++){
            
            	if(i%primo[k]==0){
            		primos = false;
                }
            }
            
            if(primos==true){
                primo[j]=i;
                j++;
            }
            i = i +2;
        }

        for(i = 0;i < primo.length;i++){
            System.out.println(primo[i]);
        }
    }
}
