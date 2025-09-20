// Exercício 4: Organizando uma Lista de Espera Dinâmica 
// Autor: [William Brito]
// Data: [20-09-2025]

/* Este programa demonstra o uso de um (ArrayList) para gerenciar uma lista de espera, de um 
determinado Restaurante permitindo adicionar e remover nomes de forma dinâmica.
 */
 

import java.util.ArrayList;
import java.util.List;


public class Exercicio4 {
    
    public static void main(String[] args) {
        List<String> listaDeEspera = new ArrayList<>();

        System.out.println("--- Gestão da Lista de espera do Restaurante ---");
        System.out.println("Lista inicial: " + listaDeEspera);


        // Adicionando clientes à lista
        System.out.println("\nAdicionando clientes à lista...");
        listaDeEspera.add("Ana");
        listaDeEspera.add("Carlos");
        listaDeEspera.add("Beatriz");
        System.out.println("Lista atualizada: " + listaDeEspera);
        System.out.println("Total de clientes aguardando: " + listaDeEspera.size());

        // Removendo um cliente da lista
        System.out.println("\nRemovendo o cliente 'Carlos'...");
        listaDeEspera.remove("Carlos");
        System.out.println("Lista final:" + listaDeEspera);
        System.out.println("Total de clientes aguardando: " + listaDeEspera.size());
    }

}
