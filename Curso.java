public class Curso {

    // Atributo da classe
    // "private" aplica encapsulamento, permitindo acesso apenas dentro da classe
    private String nome;

    // Construtor da classe
    // É executado quando um objeto Curso é criado
    public Curso(String nome){ this.nome = nome;}

    // Getter do nome
    // Método usado para retornar o valor do atributo nome
    public String getNome(){ return nome; }
}