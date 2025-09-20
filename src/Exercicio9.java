// Exercício 9: Gerenciando um Cadastro de Clientes 
// Autor: [William Brito]
// Data: [20-09-2025]

/* Este exercício introduz a Programação Orientada a Objetos com a criação de uma classe Pessoa e um programa principal que gerencia uma lista de clientes. */



import java.util.ArrayList;
import java.util.List;

public class Exercicio9 {

    public static void main(String[] args) {
        // Cria uma lista para armazenar os objetos do tipo Pessoa
        List<Pessoa> clientes = new ArrayList<>();

        System.out.println("--- GERENCIANDO CADASTRO DE CLIENTES ---");

        // Cria novos objetos (instâncias) da classe Pessoa
        Pessoa cliente1 = new Pessoa("William C. Brito", 30, "Rua das Flores, 123");
        Pessoa cliente2 = new Pessoa("Maria Souza", 25, "Avenida Brasil, 456");
        Pessoa cliente3 = new Pessoa("João Silva", 42, "Praça da Sé, 789");

        // Adiciona os objetos à lista de clientes
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        System.out.println("\n--- LISTA DE CLIENTES CADASTRADOS ---");
        // Itera sobre a lista e chama o método de cada objeto para exibir seus detalhes
        for (Pessoa cliente : clientes) {
            cliente.exibirDetalhes();
        }
    }
}