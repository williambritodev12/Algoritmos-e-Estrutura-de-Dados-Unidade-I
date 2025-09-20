// Exercício 10: Desafio Final - Sistema de Gerenciamento de Estoque 
// Autor: [William Brito]
// Data: [20-09-2025]



/* Este desafio integra os conceitos aprendidos em um sistema de menu interativo para gerenciar o estoque de uma loja, utilizando classes, listas e interação com o usuário. */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaEstoque {
    // Lista para armazenar todos os objetos 'Produto' do nosso estoque.
    private List<Produto> estoque = new ArrayList<>();
    // Objeto Scanner para ler a entrada do usuário a partir do console.
    private Scanner scanner = new Scanner(System.in);

    /**
     * O método main é o ponto de entrada do programa.
     * Ele cria uma instância do sistema e inicia sua execução.
     */
    public static void main(String[] args) {
        SistemaEstoque sistema = new SistemaEstoque();
        sistema.executar();
    }

    /**
     * Controla o fluxo principal do programa, exibindo o menu e processando
     * a escolha do usuário em um loop até que ele decida sair.
     */
    public void executar() {
        int opcao = 0;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner após ler um número.

            switch (opcao) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    removerItem();
                    break;
                case 3:
                    atualizarQuantidade();
                    break;
                case 4:
                    listarItens();
                    break;
                case 5:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 5);
        scanner.close(); // Fecha o scanner para liberar recursos.
    }

    /**
     * Imprime as opções do menu no console.
     */
    private void exibirMenu() {
        System.out.println("\n--- SISTEMA DE GERENCIAMENTO DE ESTOQUE ---");
        System.out.println("1. Adicionar novo item");
        System.out.println("2. Remover item por código");
        System.out.println("3. Atualizar quantidade do item");
        System.out.println("4. Listar todos os itens no estoque");
        System.out.println("5. Sair");
    }

    /**
     * Solicita os dados de um novo produto, cria um objeto 'Produto' e o adiciona à lista de estoque.
     */
    private void adicionarItem() {
        System.out.println("\n--- ADICIONAR NOVO ITEM ---");
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();

        // Validação para evitar códigos duplicados
        if (buscarProdutoPorCodigo(codigo) != null) {
            System.out.println("ERRO: Já existe um produto com este código.");
            return; // Encerra o método
        }

        System.out.print("Digite a quantidade inicial: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Produto novoProduto = new Produto(nome, codigo, quantidade);
        estoque.add(novoProduto);
        System.out.println("'" + nome + "' foi adicionado ao estoque com sucesso!");
    }

    /**
     * Solicita o código de um produto, o remove da lista de estoque se ele existir.
     */
    private void removerItem() {
        System.out.println("\n--- REMOVER ITEM ---");
        System.out.print("Digite o código do produto a ser removido: ");
        String codigo = scanner.nextLine();

        Produto produtoParaRemover = buscarProdutoPorCodigo(codigo);
        if (produtoParaRemover != null) {
            estoque.remove(produtoParaRemover);
            System.out.println("Produto '" + produtoParaRemover.getNome() + "' removido com sucesso!");
        } else {
            System.out.println("Produto com o código '" + codigo + "' não foi encontrado.");
        }
    }

    /**
     * Solicita o código de um produto e a nova quantidade, atualizando o item no estoque.
     */
    private void atualizarQuantidade() {
        System.out.println("\n--- ATUALIZAR QUANTIDADE ---");
        System.out.print("Digite o código do produto a ser atualizado: ");
        String codigo = scanner.nextLine();

        Produto produtoParaAtualizar = buscarProdutoPorCodigo(codigo);
        if (produtoParaAtualizar != null) {
            System.out.print("Digite a nova quantidade para '" + produtoParaAtualizar.getNome() + "': ");
            int novaQuantidade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            produtoParaAtualizar.setQuantidade(novaQuantidade);
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Produto com o código '" + codigo + "' não foi encontrado.");
        }
    }

    /**
     * Exibe todos os produtos atualmente na lista de estoque.
     */
    private void listarItens() {
        System.out.println("\n--- LISTA DE ITENS NO ESTOQUE ---");
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            for (Produto produto : estoque) {
                // O método 'toString' da classe Produto é chamado aqui implicitamente
                System.out.println(produto);
            }
        }
        System.out.println("-----------------------------------");
    }

    /**
     * Método auxiliar para encontrar um produto na lista pelo seu código.
     * @param codigo O código a ser procurado.
     * @return O objeto Produto se encontrado, ou null se não existir.
     */
    private Produto buscarProdutoPorCodigo(String codigo) {
        for (Produto p : estoque) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }
}