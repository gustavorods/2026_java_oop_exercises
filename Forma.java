// Classe abstrata
// "abstract" indica que esta classe não pode ser instanciada diretamente
// Ela serve como modelo para outras classes
public abstract class Forma {

    // Método abstrato
    // Não possui implementação (não tem corpo)
    // Obriga as classes que herdam de Forma a implementar este método
    public abstract double calcularArea();
}