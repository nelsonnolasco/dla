package exec_livro;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", 2017, 263);

        // Exibir detalhes iniciais do livro
        System.out.println(livro1.detalhar());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a página atual lida:");
        int paginaAtual = scanner.nextInt();

        livro1.atualizarPaginas(paginaAtual);
        System.out.println("Detalhes atualizados do livro:");
        System.out.println(livro1.detalhar());

        if(livro1.livroCompleto()) {
            System.out.println("Você terminou o livro!");
        } else {
            System.out.println("Ainda há páginas para ler.");
        }

        scanner.close();
    }
}

