package PesquisaBinaria;
/* A pesquisa binária é um algoritmo de busca eficiente que funciona sobre coleções ordenadas. Seu princípio é simples: a cada iteração, o algoritmo compara o valor procurado com o elemento central da lista e descarta metade dos dados, reduzindo drasticamente o espaço de busca.

Do ponto de vista de desempenho, a pesquisa binária possui complexidade de tempo O(log n), segundo a notação Big O. Isso significa que o número de operações cresce de forma logarítmica conforme o tamanho da entrada aumenta. Na prática, mesmo com grandes volumes de dados, o algoritmo realiza poucas comparações, tornando-se extremamente eficiente.

A notação Big O é importante porque permite ao desenvolvedor avaliar e comparar algoritmos de forma objetiva, independentemente da linguagem ou do hardware. No dia a dia do desenvolvimento de software, compreender Big O ajuda a:

prever gargalos de desempenho,

tomar decisões arquiteturais mais eficientes,

escrever código escalável e sustentável.

Entender algoritmos e sua complexidade não é apenas um conceito acadêmico, mas uma habilidade essencial para resolver problemas reais com eficiência.*/

public class PesquisaBinaria {

    public static int buscaBinaria(int[] array, int alvo) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (array[meio] == alvo) {
                return meio;
            }

            if (array[meio] < alvo) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {2, 5, 8, 12, 16,10, 23,45,50, 38, 45, 56, 72};
        int valorProcurado = 23;

        int resultado = buscaBinaria(numeros, valorProcurado);

        if (resultado != -1) {
            System.out.println("Valor encontrado no índice: " + resultado);
        } else {
            System.out.println("Valor não encontrado no array.");
        }
    }
}
