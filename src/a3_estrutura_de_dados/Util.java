package a3_estrutura_de_dados;

import java.util.List;

public class Util {
    public static int soma(List<Integer> lista) {
        int total = 0;
        for (int v : lista) {
            total += v;
        }
        return total;
    }
}

