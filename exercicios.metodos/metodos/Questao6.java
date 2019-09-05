
package exercicios.metodos;

import java.util.Scanner;

/**
 *
 * @author Marlon Santana dos S
 */
public class Questao6 {
    public static boolean verificarParicidade(int num){
        boolean verif = false;
        
        if(num %2 == 0){
            verif = true;
        }else{
            verif = false;
        }
        
        return verif;
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Digite um número");
        num = tc.nextInt();
        
        System.out.println(verificarParicidade(num));
    }
}
