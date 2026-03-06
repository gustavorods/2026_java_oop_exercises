// A classe Carro herda da classe Veiculo
// "extends" indica herança (Carro é um tipo de Veiculo)
public class Carro extends Veiculo{

    // Atributo específico do carro
    // "private" significa que só pode ser acessado dentro desta classe
    private int portas;

    // Construtor da classe Carro
    // Recebe os atributos da classe pai (marca, modelo, ano)
    // e também o atributo específico portas
    public Carro(String marca, String modelo, int ano, int portas){

        // "super" chama o construtor da classe pai (Veiculo)
        // Isso inicializa marca, modelo e ano
        super(marca, modelo, ano);

        // Inicializa o atributo específico da classe Carro
        this.portas = portas;
    }

    // @Override indica que estamos sobrescrevendo
    // um método que já existe na classe pai (Veiculo)
    @Override
    public void exibirDados(){

        // Como marca, modelo e ano são protected na classe pai,
        // podemos acessá-los diretamente aqui
        System.out.println("Carro: " + marca + " " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Portas: " + portas);
    }
}