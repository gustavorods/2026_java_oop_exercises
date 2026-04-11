public class Main {

    public static void main(String[] args) {

        // =========================
        // BLOCO: PRODUTO
        // =========================
        System.out.println("\n=========================");
        System.out.println("       PRODUTO");
        System.out.println("=========================");

        Produto p = new Produto("Notebook", 3500, 5);
        p.exibirInformacoes();


        // =========================
        // BLOCO: VEÍCULOS
        // =========================
        System.out.println("\n=========================");
        System.out.println("       VEÍCULOS");
        System.out.println("=========================");

        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Carro("Toyota", "Corolla", 2022, 4);
        veiculos[1] = new Moto("Honda", "CB500", 2023, 500);

        for (Veiculo v : veiculos) {
            v.exibirDados();
        }


        // =========================
        // BLOCO: ALUNO E CURSO
        // =========================
        System.out.println("\n=========================");
        System.out.println("     ALUNO / CURSO");
        System.out.println("=========================");

        Curso c = new Curso("ADS");
        Aluno a = new Aluno("Fernando", c);
        a.exibirDados();


        // =========================
        // BLOCO: CALCULADORA
        // =========================
        System.out.println("\n=========================");
        System.out.println("     CALCULADORA");
        System.out.println("=========================");

        Calculadora calc = new Calculadora();
        System.out.println(calc.somar(5, 3));
        System.out.println(calc.somar(5.5, 2.5));
    }
}