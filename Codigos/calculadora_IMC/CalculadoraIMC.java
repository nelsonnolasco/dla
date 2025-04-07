package calculadora_IMC;

import java.util.Scanner;
public class CalculadoraIMC{
    
    public static double calcularIMC(double peso, double altura){
        return peso / (altura * altura);
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    System.out.println ("Digite seu peso: ");
	    double peso = sc.nextDouble();
	    
	    System.out.println ("Digite sua altura: ");
	    double altura = sc.nextDouble();
	    
	    double imc = calcularIMC(peso, altura);	    
		System.out.printf("O IMC calculado é de: %.2f%n", imc);
	}
}

