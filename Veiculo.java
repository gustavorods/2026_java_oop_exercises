public class Veiculo {

    // Atributos do veículo
    // "protected" permite acesso na própria classe,
    // em classes do mesmo pacote e em classes que herdam esta classe
    protected String marca;
    protected String modelo;
    protected int ano;

    // Construtor da classe
    // É chamado automaticamente quando um objeto Veiculo é criado
    public Veiculo(String marca, String modelo, int ano){
        
        // "this" referencia os atributos da própria classe
        // Serve para diferenciar o atributo da classe do parâmetro recebido
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método responsável por exibir os dados do veículo no console
    public void exibirDados(){
        
        // System.out.println imprime texto no console
        // Aqui estamos concatenando (juntando) marca, modelo e ano
        System.out.println(marca + " " + modelo + " - " + ano);
    }
}