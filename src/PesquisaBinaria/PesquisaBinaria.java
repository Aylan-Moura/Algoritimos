package PesquisaBinaria;

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
