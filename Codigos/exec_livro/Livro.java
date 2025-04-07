package exec_livro;

public class Livro{
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private int paginasLidas = 0;

    // Construtor que inicializa os atributos.
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar detalhes do livro (todos os detalhes)

    public String detalhar() {
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nAno de Publicação: " + anoPublicacao +
                "\nNúmero de Páginas: " + numeroPaginas +
                "\nPáginas Lidas: " + paginasLidas;
    }




    // Método para atualizar páginas lidas, não podendo avançar o número de paginas do livro.
    public void atualizarPaginas(int paginaAtual) {
        if(paginaAtual > numeroPaginas) {
            // Caso o usuário informe um valor maior que o total de páginas, atualiza para o total.
            paginasLidas = numeroPaginas;
        } else {
            paginasLidas = paginaAtual;
        }
    }

    // Método ler total
    public boolean livroCompleto() {
        return paginasLidas == numeroPaginas;
    }

}


