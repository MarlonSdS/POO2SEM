
package exercicios.metodos;

import java.util.Scanner;

/**
 *
 * @author Marlon Santana dos S
 */
public class Questao5 {
    public static void compararVetor(int[] val){
        int maior = 0;
        int menor = val[25];
        
        for (int i = 0; i < val.length; i++) {
            if(val[i] > maior){
                maior = val[i];
            }
            
            
            
            if(val[i] < menor){
                menor = val[i];
            }
        }
        
        System.out.println("Maior: "+ maior +" menor: "+ menor);
        
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int[] val = new int[50];
        
        System.out.println("Digite 50 números");
        for (int i = 0; i < val.length; i++) {
            val[i] = tc.nextInt();
        }
        
        compararVetor(val);
        
    }
    
}
