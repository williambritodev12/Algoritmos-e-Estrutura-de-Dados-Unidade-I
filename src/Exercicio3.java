// Exercício 3: Contagem de Clientes em um Estabelecimento
// Autor: [William Brito]
// Data: [20-09-2025]

/* Utilizando um laço de repetição (for), este programa simula a contagem de 10 
clientes entrando em uma loja a cada 1 hora.
 */

public class Exercicio3 {
        public static void main(String[] args ) {
            System.out.println("--- Registro de Entrada de Clientes ---");

            // O laço 'for' inicia com i=1, continua enquanto i for menor ou igual a 10,
            // e incrementa i a cada iteração.
            for (int i = 1; i <= 10; i++)
            {
                System.out.println("Cliente número " + i + " entrou na loja.");
            }    

            System.out.println("------------------------------");
            System.out.println("Contagem da hora finalizada.");

        }

}