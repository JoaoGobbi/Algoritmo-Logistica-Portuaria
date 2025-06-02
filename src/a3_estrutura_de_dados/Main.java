
package a3_estrutura_de_dados;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos volumes
        System.out.println("Digite os volumes dos containers: (separe os volumes por espaço)");
        String[] entrada = scanner.nextLine().split(" ");
        int[] containers = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            containers[i] = Integer.parseInt(entrada[i]);
        }

        // Capacidade dos armazéns e caminhões
        System.out.print("Capacidade de cada armazém (X): ");
        int capacidadeArmazem = scanner.nextInt();

        System.out.print("Capacidade de cada caminhão (Y): ");
        int capacidadeCaminhao = scanner.nextInt();

        // Processamento
        List<List<Integer>> armazens = Logistica.alocarEmArmazens(containers, capacidadeArmazem);
        List<List<Integer>> caminhoes = Logistica.transportarComCaminhoes(armazens, capacidadeCaminhao);

        // Saída dos armazéns
        int totalArmazens = 0;
        System.out.println("\nArmazéns usados: " + armazens.size());
        for (int i = 0; i < armazens.size(); i++) {
            List<Integer> a = armazens.get(i);
            int soma = Util.soma(a);
            totalArmazens += soma;
            System.out.println("Armazém " + (i + 1) + ": " + a + " => " + soma + "m³");
        }
        System.out.println("Total armazenado: " + totalArmazens + "m³");

        // Saída dos caminhões
        int totalCaminhoes = 0;
        System.out.println("\nCaminhões usados: " + caminhoes.size());
        for (int i = 0; i < caminhoes.size(); i++) {
            List<Integer> c = caminhoes.get(i);
            int soma = Util.soma(c);
            totalCaminhoes += soma;
            System.out.println("Caminhão " + (i + 1) + ": " + c + " => " + soma + "m³");
        }
        System.out.println("\nTotal transportado: " + totalCaminhoes + "m³");
        System.out.println("Caminhões com cargas utilizados: " + caminhoes.size());

        scanner.close();
    }
}
