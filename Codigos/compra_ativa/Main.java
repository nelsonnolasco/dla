package compra_ativa;

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println ("Digite 1 para conta ativa e qualquer outro numero para inativa");
	    int conta = sc.nextInt();
	    
	    if (conta == 1){
	        System.out.println("Conta Ativa");
	        System.out.println("Qual é o seu saldo? ");
	        double saldo = sc.nextDouble();
	        String compra = (saldo >= 500? "Você pode Comprar." : "Você não pode comprar,seu saldo é insuficiente.");
	        System.out.print ("Sua condição: " + compra);
	        
	    }else {
	        System.out.println("Conta Inativa: Você não pode comprar.");
	    }
		sc.close();
	}
}