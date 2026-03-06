// A classe Retangulo herda da classe Forma
// "extends" indica herança (Retangulo é um tipo de Forma)
public class Retangulo extends Forma{

    // Atributos privados do retângulo
    // "private" significa que só podem ser acessados dentro desta classe
    private double largura;
    private double altura;

    // Construtor da classe
    // É executado quando um objeto Retangulo é criado
    public Retangulo(double largura, double altura){

        // "this" referencia os atributos da própria classe
        // Diferencia os atributos dos parâmetros recebidos
        this.largura = largura;
        this.altura = altura;
    }

    // Método que calcula a área do retângulo
    // Provavelmente este método foi definido na classe Forma (classe pai)
    // e aqui está sendo implementado na classe filha
    public double calcularArea(){

        // Fórmula da área do retângulo
        // área = largura * altura
        return largura * altura;
    }
}