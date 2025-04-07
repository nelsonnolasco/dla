package tx_juros;

public class Main
{
	public static void main(String[] args) {
		double investimentoInicial = 1000.0;
		double taxa = 0.12;
		int anos = 10;
		
		double valorAtual = investimentoInicial;
		
		for (int i = 1; i <= anos; i++){
		    valorAtual = valorAtual * (1 + taxa);
		    System.out.printf("Ano %02d: R$ %.2f%n", i, valorAtual); 
		
		} 
		
	}
}



/* 
public class Main {
    public static void main(String[] args) {
        double investimentoInicial = 1000.0;
        double taxa = 0.12; // 12% ao ano
        int anos = 10;
        
        double valorFinal = investimentoInicial * Math.pow(1 + taxa, anos);
        System.out.printf("Valor final após %d anos: R$ %.2f%n", anos, valorFinal);
    }
}
    */