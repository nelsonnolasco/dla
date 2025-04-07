package imc;
/*
 * IMC.java
 * 
 * Este programa calcula o Índice de Massa Corporal (IMC) de uma pessoa com base no peso e altura fornecidos pelo usuário.
 * O IMC é calculado pela fórmula: IMC = peso / (altura * altura)
 * 
 * Autor: Nelson de Casmpos Nolasco
 * Data: 2025-04-02
 */

/*
import java.util.Scanner;

public class IMC {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite a sua altura (em metros): ");
        double altura = sc.nextDouble();

        // Cálculo do IMC após a leitura dos valores
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        // Fechar o Scanner
        sc.close();
    }
}
*/

// Segunnda opção, sem o Scanner, apenas com os valores fixos

public class IMC{
    
    public static void main (String[] args){
        double peso = 108.00;
        double altura = 1.80;
        double imc = peso / (altura * altura);
            
        System.out.println ("O IMC é: " + imc);
            
    }
}