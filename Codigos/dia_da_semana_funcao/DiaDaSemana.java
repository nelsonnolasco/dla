package dia_da_semana_funcao;

public class DiaDaSemana {
    public static String obterDiaDaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";
            default:
                return "Número inválido!";
        }
    }

    public static void main(String[] args) {
        int dia = 4; // Exemplo de dia da semana
        String diaDaSemana = obterDiaDaSemana(dia);
        System.out.println("O dia da semana é: " + diaDaSemana);
    }
    
}
