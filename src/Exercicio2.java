// Exercício 2: Verificador de Características de Um Produto
// Autor: [William Brito]
// Data: [20-09-2025]

/* Este programa lê o código de um produto e utliza uma estrutura condicional de (if-else)
para verficar se o número é par ou ímpar.
  */

  
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 

    // Solicita ao usuário o código do produto
    System.out.print("Digite o código do produto para verificação: ");
    int codigoProduto = scanner.nextInt();


    //  Verifica se o número é par ou ímpar usando o operador de módulo (%)
    //  Se o resto da divisão por 2 for 0, o número é par.
    if (codigoProduto % 2 == 0) {
        System.out.println("O código " + codigoProduto + " é PAR.");
    }
    else {
        System.out.println("O código " + codigoProduto + " é ÍMPAR.");
    }

    scanner.close();
    }

}