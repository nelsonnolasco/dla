package tx_juros_funcao;

public class TaxaJuros {
    public static double calcularValorFuturo(double investimentoInicial, double taxa, int anos) {
        return investimentoInicial = investimentoInicial * (1 + taxa);
    }

    public static void main(String[] args) {
        double investimentoInicial = 1000.0;
        double taxa = 0.12; // 12% ao ano
        int anos = 10;

        double valorAtual = investimentoInicial;
		
		for (int i = 1; i <= anos; i++){
		    valorAtual = valorAtual * (1 + taxa);
		    System.out.printf("Ano %02d: R$ %.2f%n", i, valorAtual);
        } 
    
    }
}
