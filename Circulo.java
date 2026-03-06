// A classe Circulo herda da classe Forma
// "extends" indica herança
public class Circulo extends Forma{

    // Atributo que representa o raio do círculo
    // "private" significa que só pode ser acessado dentro desta classe
    private double raio;

    // Construtor da classe
    // Recebe o valor do raio ao criar o objeto
    public Circulo(double raio){

        // "this" referencia o atributo da própria classe
        // Diferencia o atributo do parâmetro recebido
        this.raio = raio;
    }

    // Implementação do método abstrato da classe Forma
    // Toda classe que herda de Forma deve implementar calcularArea()
    public double calcularArea(){

        // Fórmula da área do círculo: π * r²
        // Math.PI representa o valor de π (3.14159...)
        return Math.PI * raio * raio;
    }
}