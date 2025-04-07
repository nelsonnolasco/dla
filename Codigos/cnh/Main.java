package cnh;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int cnh;
		int idade;
		
		System.out.println("Caso seja sua primeira CNH digite 0, caso contrário digite 1");
		cnh = sc.nextInt();
		
		if (cnh == 0){
		    System.out.println ("Sua renovação é em 1 ano da data da expedição");
		    
		} else {
		    System.out.println ("Digite a sua idade para saber o prazo para renovação de sua CNH.");
		    idade = sc.nextInt();
		    
		    if (idade <18){ 
		        System.out.println("Você não pode ter uma CNH");
		        
		    } else if (idade >=18 && idade <50){
		        System.out.println("Sua renovação é a cada 10 anos");
		    } else if (idade >=50 && idade <=70){
		        System.out.println("Sua renovação é a cada 5 anos");
		    } else {
		        System.out.println("Sua renovação é a cada 3 anos");
		    }
	    }
	    
	    sc.close();
	}
}