
package exercicios.metodos;

import java.util.Scanner;

/**
 *
 * @author Marlon Santana dos S
 */
public class Questao1 {
    public static double calcularMedia(double nota1, double nota2, double nota3){
        return(nota1 + nota2 + nota3)/3;
    }
    
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite as três notas do aluno");
        double nota1 = tc.nextDouble();
        double nota2 = tc.nextDouble();
        double nota3 = tc.nextDouble();
        
        System.out.println("Média:");
        System.out.println(calcularMedia(nota1, nota2, nota3));
    }
    
}
