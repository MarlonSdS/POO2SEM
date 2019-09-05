
package exercicios.metodos;

import java.util.Scanner;

/**
 *
 * @author Marlon Santana dos S
 */
public class Questao4 {
    public static void ordenarValores(int v1,int v2,int v3){
        int menor = 0;
        int meio = 0;
        int maior = 0;
        
        if(v1 > v2 && v1 > v3){
            maior = v1;
            if(v2 > v3){
                meio = v2;
                menor = v3;
            }else{
                meio = v3;
                menor = v2;
            }
        }else if(v2 > v1 && v2 > v3){
            maior = v2;
            if(v1 > v3){
                meio = v1;
                menor = v3;
            }else{
                meio = v3;
                menor = v1;
            }
        }else if(v3 > v1 && v3 > v2){
            maior = v3;
            if(v1 > v2){
                meio = v1;
                menor = v2;
            }else{
                meio = v2;
                menor = v1;
            }
        }
        
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
    }
    
    public static void main(String[] args) {
        System.out.println("Digite três valores");
        Scanner tc = new Scanner(System.in);
        int v1 = tc.nextInt();
        int v2 = tc.nextInt();
        int v3 = tc.nextInt();
        
        System.out.println("Na ordem crescente:");
        
        ordenarValores(v1, v2, v3);
    }
}
