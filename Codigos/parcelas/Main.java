package parcelas;

public class Main {
    public static void main(String[] args) {
        double valorTotal = 1200.00; // valor total do produto
        int totalParcelas = 12;
        double valorParcela = valorTotal / totalParcelas;
        double restante = valorTotal;
        int parcela = 1;
        
        while (parcela <= totalParcelas) {
            restante -= valorParcela;  // atualiza o valor restante após o pagamento da parcela
            System.out.printf("Parcela %02d: R$ %.2f - Restante: R$ %.2f%n", parcela, valorParcela, restante);
            parcela++;
        }
    }
}

