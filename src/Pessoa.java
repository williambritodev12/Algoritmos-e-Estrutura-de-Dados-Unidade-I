
public class Pessoa {
    // Atributos da classe (características de uma Pessoa)
    private String nome;
    private int idade;
    private String endereco;

    // Construtor: método especial para criar objetos desta classe
    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    // Método para exibir as informações do objeto de forma organizada
    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome + ", Idade: " + this.idade + ", Endereço: " + this.endereco);
    }
}