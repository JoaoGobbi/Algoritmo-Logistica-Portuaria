package a3_estrutura_de_dados;
import java.util.*;

public class Logistica {

    // Alocação nos armazéns com First Fit Decreasing
    public static List<List<Integer>> alocarEmArmazens(int[] containers, int capacidade) {
        Arrays.sort(containers);
        List<List<Integer>> armazens = new ArrayList<>();
        List<Integer> capacidades = new ArrayList<>();

        for (int i = containers.length - 1; i >= 0; i--) {
            int volume = containers[i];
            boolean alocado = false;

            for (int j = 0; j < armazens.size(); j++) {
                if (capacidades.get(j) + volume <= capacidade) {
                    armazens.get(j).add(volume);
                    capacidades.set(j, capacidades.get(j) + volume);
                    alocado = true;
                    break;
                }
            }

            if (!alocado) {
                List<Integer> novo = new ArrayList<>();
                novo.add(volume);
                armazens.add(novo);
                capacidades.add(volume);
            }
        }
        return armazens;
    }

    // Transporte respeitando containers indivisíveis
    public static List<List<Integer>> transportarComCaminhoes(List<List<Integer>> armazens, int capCaminhao) {
        List<Integer> todosContainers = new ArrayList<>();
        for (List<Integer> a : armazens) {
            todosContainers.addAll(a);
        }

        todosContainers.sort(Collections.reverseOrder());

        List<List<Integer>> caminhoes = new ArrayList<>();
        List<Integer> capacidades = new ArrayList<>();

        for (int container : todosContainers) {
            boolean alocado = false;
            for (int i = 0; i < caminhoes.size(); i++) {
                if (capacidades.get(i) + container <= capCaminhao) {
                    caminhoes.get(i).add(container);
                    capacidades.set(i, capacidades.get(i) + container);
                    alocado = true;
                    break;
                }
            }

            if (!alocado) {
                List<Integer> novo = new ArrayList<>();
                novo.add(container);
                caminhoes.add(novo);
                capacidades.add(container);
            }
        }

        return caminhoes;
    }
}
