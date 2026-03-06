public class Aluno {

    // Atributos da classe
    // nome do aluno
    private String nome;

    // Objeto do tipo Curso
    // Representa o curso em que o aluno está matriculado
    // Isso é um exemplo de associação entre classes
    private Curso curso;

    // Construtor da classe
    // Recebe o nome do aluno e o curso ao criar o objeto
    public Aluno(String nome, Curso curso){

        // "this" referencia os atributos da própria classe
        this.nome = nome;
        this.curso = curso;
    }

    // Método que exibe as informações do aluno
    public void exibirDados(){

        // Exibe o nome do aluno
        System.out.println("Aluno: " + nome);

        // Exibe o nome do curso
        // curso.getNome() chama o método da classe Curso
        System.out.println("Curso: " + curso.getNome());
    }
}