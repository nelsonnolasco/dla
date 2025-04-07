package imc_notacao;

import java.util.Scanner;

public class IMC_notacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso (em kg): ");
        double peso = sc.nextDouble();

        System.out.println("Digite a sua altura (em metros): ");
        double altura = sc.nextDouble();

        // Cálculo do IMC após a leitura dos valores
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        
        // Notações do imc
          if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 24.9 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else { // imc >= 29.9
            System.out.println("Obesidade");
        }
        
        // Fechar o Scanner
        sc.close();
    }
}
