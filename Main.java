public class Main {

    // Método principal do programa
    // Todo programa Java começa a execução pelo método main
    public static void main(String[] args) {

        // Criação de um objeto Produto usando o construtor com parâmetros
        Produto p = new Produto("Notebook", 3500, 5);

        // Chamada do método que exibe as informações do produto
        p.exibirInformacoes();


        // Criação de um vetor (array) do tipo Veiculo com 2 posições
        // Ele pode armazenar objetos de classes que herdam de Veiculo
        Veiculo[] veiculos = new Veiculo[2];

        // Criando um objeto Carro e armazenando na posição 0 do vetor
        veiculos[0] = new Carro("Toyota", "Corolla", 2022, 4);

        // Criando um objeto Moto e armazenando na posição 1 do vetor
        veiculos[1] = new Moto("Honda", "CB500", 2023, 500);

        // Estrutura de repetição "for-each"
        // Percorre todos os elementos do vetor veiculos
        for(Veiculo v : veiculos){

            // Chama o método exibirDados()
            // Cada objeto executará sua própria versão do método
            // (conceito de polimorfismo)
            v.exibirDados();
        }


        // Criação de um objeto Curso
        Curso c = new Curso("ADS");

        // Criação de um objeto Aluno que recebe um Curso
        // Exemplo de relacionamento entre classes (associação)
        Aluno a = new Aluno("Fernando", c);

        // Exibe os dados do aluno
        a.exibirDados();


        // Criação de um objeto da classe Calculadora
        Calculadora calc = new Calculadora();

        // Chamada do método somar usando inteiros
        System.out.println(calc.somar(5,3));

        // Chamada do método somar usando números decimais
        // Exemplo de sobrecarga de métodos (mesmo método com parâmetros diferentes)
        System.out.println(calc.somar(5.5,2.5));
    }
}