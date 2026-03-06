public class Pessoa {

    // Atributos da classe
    // "private" garante encapsulamento, ou seja,
    // os atributos só podem ser acessados diretamente dentro da própria classe
    private String nome;
    private int idade;

    // Construtor da classe
    // É chamado quando um objeto Pessoa é criado
    // Serve para inicializar os atributos da classe
    public Pessoa(String nome, int idade){

        // "this" referencia os atributos da própria classe
        // Diferencia o atributo da classe do parâmetro recebido
        this.nome = nome;
        this.idade = idade;
    }

    // Getter do nome
    // Método utilizado para retornar o valor do atributo nome
    public String getNome(){
        return nome;
    }

    // Getter da idade
    // Método utilizado para retornar o valor do atributo idade
    public int getIdade(){
        return idade;
    }

    // Método que aumenta a idade da pessoa
    // Recebe a quantidade de anos que devem ser adicionados
    public void envelhecer(int anos){

        // Operador "+=" adiciona o valor de "anos" à idade atual
        idade += anos;
    }
}