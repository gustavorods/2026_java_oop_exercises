public class Produto {

    // Atributos da classe
    // "private" significa que só podem ser acessados dentro da própria classe
    // Isso é parte do conceito de encapsulamento
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor padrão (sem parâmetros)
    // Permite criar um objeto sem passar valores inicialmente
    public Produto() {
    }

    // Construtor com parâmetros
    // Permite criar um objeto já definindo seus valores
    public Produto(String nome, double preco, int quantidade) {

        // "this" referencia os atributos da própria classe
        // Diferencia o atributo da classe do parâmetro recebido
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getter do nome
    // Serve para retornar o valor do atributo nome
    public String getNome() {
        return nome;
    }

    // Setter do nome
    // Serve para alterar o valor do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter do preço
    // Retorna o valor do atributo preco
    public double getPreco() {
        return preco;
    }

    // Setter do preço
    // Antes de alterar o valor, verifica se ele é válido
    public void setPreco(double preco) {

        // Validação para evitar preço negativo
        if(preco >= 0){
            this.preco = preco;
        }
    }

    // Getter da quantidade
    // Retorna o valor da quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Setter da quantidade
    // Também possui validação para evitar valores negativos
    public void setQuantidade(int quantidade) {
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }
    }

    // Método que exibe as informações do produto no console
    public void exibirInformacoes(){

        // System.out.println imprime informações no console
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
}