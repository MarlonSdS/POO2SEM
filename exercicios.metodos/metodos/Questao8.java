
package exercicios.metodos;

import java.util.Scanner;

/**
 *
 * @author Marlon Santana dos S
 */
public class Questao8 {
    public static void verSeETriangulo(double X, double Y, double Z){
        if(X+Y !=Z || X+Z != Y || Y+Z != X){
            if(X == Y && X == Z){
                System.out.println("É um triângulo Equilátero");
            }else if(X == Y || X == Z || Y == Z){
                System.out.println("É um triângulo Isósceles");
            }else if(X != Y && X != Z && Z != Y){
                System.out.println("É um triângulo Escaleno");
            }
        }else{
            System.out.println("Não é um triângulo");
        }
    }
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Digite a medida de três lados");
        double X = tc.nextDouble();
        double Y = tc.nextDouble();
        double Z = tc.nextDouble();
        
        verSeETriangulo(X, Y, Z);
    }
}
