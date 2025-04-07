package dobro_investimento;
public class Main
{
	public static void main(String[] args) {
		double valorInicial = 1000;
		double valorAtual = valorInicial;
		double taxa = 0.05;
		int anos = 0;
		
		while (valorAtual < valorInicial*2){
		    valorAtual *=(1 + taxa);
		    anos++;
		}
		
		System.out.println("O investimento dobrou em " + anos + " anos.");
	}
}