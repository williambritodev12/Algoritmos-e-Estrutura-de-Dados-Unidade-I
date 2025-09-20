// Exercício 7: Jogo da Velha Interativo
// Autor: [William Brito]
// Data: [20-09-2025]


/* Este programa implementa um jogo da Velha funcional para dois
 * jogadores, usando uma matriz 2D para o tabuleiro.
 */


import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char jogadorAtual = 'X';
        boolean jogoContinua = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- JOGO DA VELHA ---");

        while (jogoContinua) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogadorAtual + ", é a sua vez.");

            int linha, coluna;
            do {
                System.out.print("Digite a linha (1-3): ");
                linha = scanner.nextInt() - 1;
                System.out.print("Digite a coluna (1-3): ");
                coluna = scanner.nextInt() - 1;
            } while (!jogadaValida(tabuleiro, linha, coluna));

            tabuleiro[linha][coluna] = jogadorAtual;

            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
                jogoContinua = false;
            } else if (verificarEmpate(tabuleiro)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("O jogo terminou em EMPATE!");
                jogoContinua = false;
            }

            // Alterna o jogador
            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    public static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean jogadaValida(char[][] tabuleiro, int linha, int coluna) {
        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            System.out.println("Jogada inválida! Posição fora do tabuleiro.");
            return false;
        }
        if (tabuleiro[linha][coluna] != ' ') {
            System.out.println("Jogada inválida! Essa posição já está ocupada.");
            return false;
        }
        return true;
    }

    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) return true;
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) return true;
        }
        // Verifica diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) return true;
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) return true;
        return false;
    }

    public static boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false; // Se ainda houver espaço vazio, não é empate
                }
            }
        }
        return true; // Se não houver espaços vazios, é empate
    }
}