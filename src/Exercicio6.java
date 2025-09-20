// Exercício 6: Seleção de Números Primos para Criptografia
// Autor: [William Brito]
// Data: [20-09-2025]


/* Este código utiliza laços aninhados para identificar e exibir
 * todos os números primos no intervalo de 1 a 100.
*/


public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("--- Números primos entre 1 e 100 ---");


        // Laço externo para percorrer os números de 2 a 100
        for (int numero = 2; numero <= 100; numero++) {
            boolean ehPrimo = true; 

            // Laço interno para verificar se o 'número' tem divisores além de 1 e ele mesmo.
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                // Se for divisível por algum número,  não é o primo
                if (numero % i == 0) {
                    ehPrimo = false;
                    break; // Para a verificação, pois já sabemos que não é primo.

                }
            }

            // Se a variável 'ehPrimo' permaneceu 'true', o número é primo.
            if (ehPrimo) {
                System.out.println(numero + " ");
            }
        }
        System.out.println("\n-------------------------------");
    }


}

