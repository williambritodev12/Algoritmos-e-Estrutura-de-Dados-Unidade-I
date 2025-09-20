// Exercício 1: Explorando Variáveis no Sistema de Reservas de um Hotel 
// Autor: [William Brito]
// Data: [20-09-2025]

/*Este fluxo de um programa básico de reservas de hotel em Java demonstra a declaração e
inicialização de variáveis, bem como a exibição formatada dessas variáveis no console.  
utilizando (int, double, String).   
 */


public class Exercicio1 {
    public static void main(String[] args) {
        // 1. Declaração das variveis conforme o enunciado
    int numeroQuarto = 101;
    double valorDiaria = 350.50;
    String nomeHospede = "William Carneiro Brito";
    
    // 2. Exibição dos valores formatados na tela
    System.out.println("--- SISTEMA DE RESERVAS DO HOTEL ---");
    System.out.println("-------------------------------------");
    System.out.println("Nome do Hóspede: " + nomeHospede);
    System.out.println("Número do Quarto: " + numeroQuarto);
    System.out.println("Valor da Diária: R$ " + String.format("%.2f", valorDiaria));
    }
}
