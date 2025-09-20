public class Produto {
    // --- ATRIBUTOS ---
    // Atributos privados garantem que os dados só podem ser acessados
    // e modificados através dos métodos da classe (encapsulamento).
    private String nome;
    private String codigo;
    private int quantidade;

    // --- CONSTRUTOR ---
    /**
     * O construtor é um método especial chamado quando um novo objeto Produto é criado.
     * Ele inicializa os atributos do objeto com os valores fornecidos.
     * @param nome O nome do produto.
     * @param codigo O código único do produto.
     * @param quantidade A quantidade inicial do produto em estoque.
     */
    public Produto(String nome, String codigo, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    // --- MÉTODOS GETTERS ---
    // Getters são métodos públicos que permitem a leitura dos valores dos atributos privados.
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // --- MÉTODO SETTER ---
    /**
     * Setters são métodos públicos que permitem a alteração dos valores dos atributos privados.
     * Aqui, incluímos uma validação para não permitir estoque negativo.
     * @param novaQuantidade A nova quantidade do produto.
     */
    public void setQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidade = novaQuantidade;
        } else {
            System.out.println("Erro: A quantidade não pode ser negativa.");
        }
    }

    // --- MÉTODO toString ---
    /**
     * O método toString é chamado automaticamente quando tentamos imprimir um objeto.
     * Nós o sobrescrevemos para fornecer uma representação textual amigável do produto.
     * @return Uma String formatada com os detalhes do produto.
     */
    @Override
    public String toString() {
        return "Produto [Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade + "]";
    }
}