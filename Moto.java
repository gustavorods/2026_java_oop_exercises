// A classe Moto herda da classe Veiculo
// Isso significa que Moto reutiliza atributos e métodos de Veiculo
public class Moto extends Veiculo{

    // Atributo específico da moto
    // "private" indica que só pode ser acessado dentro desta classe
    private int cilindradas;

    // Construtor da classe Moto
    // Recebe também os atributos da classe pai (Veiculo)
    public Moto(String marca, String modelo, int ano, int cilindradas){

        // "super" chama o construtor da classe pai (Veiculo)
        // Isso inicializa marca, modelo e ano
        super(marca, modelo, ano);

        // Inicializa o atributo específico da moto
        this.cilindradas = cilindradas;
    }

    // @Override indica que estamos sobrescrevendo
    // um método que já existe na classe pai (Veiculo)
    @Override
    public void exibirDados(){

        // Como marca, modelo e ano são protected na classe pai,
        // podemos acessá-los diretamente aqui
        System.out.println("Moto: " + marca + " " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cilindradas: " + cilindradas);
    }
}