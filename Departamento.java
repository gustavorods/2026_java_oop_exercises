// Importa a classe ArrayList da biblioteca Java
// ArrayList é uma lista dinâmica que pode crescer conforme adicionamos elementos
import java.util.ArrayList;

public class Departamento {

    // Atributos da classe
    private String nome;

    // Lista que armazenará objetos do tipo Funcionario
    private ArrayList<Funcionario> funcionarios;

    // Construtor da classe
    public Departamento(String nome){

        // Inicializa o nome do departamento
        this.nome = nome;

        // Cria uma nova lista vazia de funcionários
        funcionarios = new ArrayList<>();
    }

    // Método responsável por adicionar um funcionário à lista
    public void adicionarFuncionario(Funcionario f){

        // add() adiciona um novo elemento na lista
        funcionarios.add(f);
    }

    // Método que lista todos os funcionários do departamento
    public void listarFuncionarios(){

        // Exibe o nome do departamento
        System.out.println("Departamento: " + nome);

        // Estrutura for-each para percorrer todos os funcionários da lista
        for(Funcionario f : funcionarios){

            // Chama o getter para mostrar o nome de cada funcionário
            System.out.println(f.getNome());
        }
    }
}