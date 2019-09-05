
package exercicios.metodos;

import java.util.Scanner;

/**
 *
 * @author Marlon Santana dos S
 */
public class Questao7 {
    public static boolean verificarPositividade(int num){
        boolean verif = false;
        
        if(num >= 0){
            verif = true;
        }else{
            verif = false;
        }
        
        return verif;
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int num = tc.nextInt();
        
        System.out.println(verificarPositividade(num));
    }
}
