public class Funcionario {

    // Atributo da classe
    // "private" aplica encapsulamento, permitindo acesso apenas dentro da classe
    private String nome;

    // Construtor da classe
    // É executado quando um objeto Funcionario é criado
    public Funcionario(String nome) { this.nome = nome; }

    // Getter do nome
    // Método usado para acessar o valor do atributo nome
    public String getNome() { return nome; }
}