package alunos;

public class CadastroAlunos {
    
    private String nome;
    private String matricula;
    private String curso;
    private int anoIngresso;
    private double[] nota;
    
    public CadastroAlunos(String nome, String matricula, String curso, int anoIngresso, double nota []) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.nota = nota;
    }

    // Método detalhar alunos
    public void detalharAlunos() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Ano de Ingresso: " + anoIngresso);

        double somaNotas = 0;
        for (double n : nota) {
            somaNotas += n;
        }
        double mediaNotas = nota.length > 0 ? somaNotas / nota.length : 0;

        System.out.printf("Média das notas: %.2f%n", mediaNotas);
    }



    // Getters e setters
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    public int getAnoIngresso() {
        return anoIngresso;
    }
    public double[] getNota() {
        return nota;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
    public void setNota(double[] nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "CadastroAlunos{" + "nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + ", anoIngresso=" + anoIngresso + ", nota=" + nota + '}';
    }
    
    
    
    
}
