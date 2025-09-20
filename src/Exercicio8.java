// Exercício 8: Análise de Frequência de Pedidos no Delivery
// Autor: [William Brito]
// Data: [20-09-2025]

/* Este programa utiliza um HashMap para contar a frequência de códigos de pedidos inseridos pelo usuário e informa qual foi o mais repetido. */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> contagemPedidos = new HashMap<>();

        System.out.println("--- ANÁLISE DE FREQUÊNCIA DE PEDIDOS ---");
        System.out.println("Digite os códigos dos pedidos. Digite 'fim' para terminar.");

        while (true) {
            System.out.print("Código do pedido: ");
            String pedido = scanner.nextLine();
            if (pedido.equalsIgnoreCase("fim")) {
                break;
            }
            // Atualiza a contagem do pedido no mapa
            contagemPedidos.put(pedido, contagemPedidos.getOrDefault(pedido, 0) + 1);
        }

        if (contagemPedidos.isEmpty()) {
            System.out.println("Nenhum pedido foi registrado.");
        } else {
            String itemMaisRepetido = "";
            int maxFrequencia = 0;

            // Itera sobre o mapa para encontrar o item com a maior frequência
            for (Map.Entry<String, Integer> entry : contagemPedidos.entrySet()) {
                if (entry.getValue() > maxFrequencia) {
                    maxFrequencia = entry.getValue();
                    itemMaisRepetido = entry.getKey();
                }
            }
            System.out.println("\n--- RESULTADO DA ANÁLISE ---");
            System.out.println("O item mais pedido foi o de código '" + itemMaisRepetido + "', com " + maxFrequencia + " pedidos.");
        }
        scanner.close();
    }
}