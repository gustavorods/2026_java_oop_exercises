public class Calculadora {

    // Método que soma dois números inteiros
    // Recebe dois parâmetros do tipo int
    public int somar(int a, int b) { return a + b; }

    // Sobrecarga de método (Overload)
    // Mesmo nome de método, porém com tipos de parâmetros diferentes
    public double somar(double a, double b) { return a + b; }
}