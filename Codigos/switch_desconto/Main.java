package switch_desconto;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Digite: 1 - Alimentos, 2 - Eletrônicos, 3 - Roupas, 4 - Livros");
		
		int produto = sc.nextInt();
		
		System.out.println ("Digite o valor do Produto sem desconto: ");
		double valor = sc.nextDouble();
		
		
		String desconto = switch (produto){
		    case 1 -> "Alimentos O valor final do produto com desconto de 5% é: " + (valor - valor *.05);
		    case 2 -> "Eletrônicos O valor final do produto com desconto de 10% é: " + (valor - valor*.1);
		    case 3 -> "Roupas O valor final do produto com desconto de 20% é: " + (valor - valor*.2);
		    case 4 -> "Livros - O valor final do produto com desconto de 50% é: " + (valor - valor*.5);
		    default -> "Não há desconto";
		};
		
		System.out.println ("O valor final do produto é :" + desconto);
		
		sc.close();
	}
}
