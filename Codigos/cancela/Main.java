package cancela;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Digite o número para o estado da cancela: ");
	    int estado = sc.nextInt();
	    
	    String resultado = switch (estado){
	        case 1 -> "Aberta";
	        case 2 -> "Fechada";
	        case 3 -> "Manutenção";
	        default -> "Número inválido, tecle Run novamente1";
	    };

        System.out.println("Estado da cancela: " + resultado);
	    
	    sc.close();
	}
}