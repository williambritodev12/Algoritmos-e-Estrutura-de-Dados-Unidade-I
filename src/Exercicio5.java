// Exercício 5: Avaliação de Notas dos Alunos
// Autor: [William Brito]
// Data: [20-09-2025]

/* O programa utiliza um (Array) para amazenar as 
 * notas  de uma turma e um laço para encontrar exibir a maior nota.
*/



public class Exercicio5 {

    public static void main(String[] args) {
        // Declara e inicializa o Array de notas
        double[] notas = {8.5, 9.0, 7.2, 6.5, 10.0, 8.8};


        // Assume que a primeira nota é a maior inicialmente para ter um ponto de partida.
        double maiorNota = notas[0];
        

        // Percorre o Array a partir do segundo elemento para encontrar a maior nota.
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
        }
 
        }

    System.out.println("--- Análise de notas da Turma ---");
    System.out.println("Notas registradas: ");
    for (double nota : notas) {
        System.out.println(nota + " | ");
    }
    System.out.println("\n\nA maior nota da turma é: " + maiorNota);
    }
}

