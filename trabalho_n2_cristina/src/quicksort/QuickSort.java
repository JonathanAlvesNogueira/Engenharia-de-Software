package quicksort;

public class QuickSort {

	// Implementação do QuickSort para números inteiros
    public  void quickSortNumerico(int[] vetor, int baixo, int alto) {
        if (baixo < alto) {
            int indiceParticao = particionarNumerico(vetor, baixo, alto);

            quickSortNumerico(vetor, baixo, indiceParticao - 1);
            quickSortNumerico(vetor, indiceParticao + 1, alto);
        }
    }

    private  int particionarNumerico(int[] vetor, int baixo, int alto) {
        int pivo = vetor[alto];
        int i = baixo - 1;

        for (int j = baixo; j < alto; j++) {
            if (vetor[j] <= pivo) {
                i++;

                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[alto];
        vetor[alto] = temp;

        return i + 1;
    }
    
    
 // Implementação do QuickSort para strings
    public  void quickSortString(String[] vetor, int baixo, int alto) {
        if (baixo < alto) {
            int indiceParticao = particionarString(vetor, baixo, alto);

            quickSortString(vetor, baixo, indiceParticao - 1);
            quickSortString(vetor, indiceParticao + 1, alto);
        }
    }

    private  int particionarString(String[] vetor, int baixo, int alto) {
        String pivo = vetor[alto];
        int i = baixo - 1;

        for (int j = baixo; j < alto; j++) {
            if (vetor[j].compareTo(pivo) <= 0) {
                i++;

                String temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }

        String temp = vetor[i + 1];
        vetor[i + 1] = vetor[alto];
        vetor[alto] = temp;

        return i + 1;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
