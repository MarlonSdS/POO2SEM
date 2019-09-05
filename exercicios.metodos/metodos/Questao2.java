
package exercicios.metodos;

import java.util.Scanner;

/**
 *
 * @author Marlon Santana dos S
 */
public class Questao2 {
    public static int somarVetor(int[] vet){
        int soma = 0;
        
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        
        return soma;
    }
    
    public static void main(String[] args) {
        int[] vet = new int[5];
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite 5 números");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tc.nextInt();
        }
        System.out.println("Soma dos números:");
        System.out.println(somarVetor(vet));
    }
}
