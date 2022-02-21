package one.digitalinnovation.List;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        // Estanciar um vector
        List<String> esportes = new Vector<>();
            esportes.add("Futebol");
            esportes.add("Basquetebol");
            esportes.add("Tênis de Mesa");
            esportes.add("Handebol");
        //Exibir os itens na ordem em que foram inseridos
        System.out.println("Exibir os itens na ordem em que foram inseridos: " + esportes);

        // Alterar o valor da posição 2 do vetor
        esportes.set(2, "Ping Pong");
        System.out.println("Alterar o valor da posição 2 do vetor: " + esportes);

        // Remover o esporte da posição 2
        esportes.remove(2);
        System.out.println("Remover o esporte a posição 2 (index 2): " + esportes);

        // Remover o esporte Handebol do vetor
        esportes.remove("Handebol");
        System.out.println("Remover o esporte Handebol do vetor: " + esportes);

        // Retornar o primeiro item do vetor"
        System.out.println("Retornar o primeiro item do vetor" + esportes.get(0));

        // Navegar no vetor esportes
        for (String esporte: esportes){
            System.out.println("Navegar no vetor esportes: " + esporte);
        }
    }
}
