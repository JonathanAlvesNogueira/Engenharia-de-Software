package bubble_sort;

public class BubbleSortString implements EstrategiaOrdenacao {

	@Override
	public void ordenar(int[] array) {
		// TODO Auto-generated method stub
		
		 // Implementação do Bubble Sort para Strings
        // (Poderia ser otimizada para usar Arrays.sort para strings, mas para fins de exemplo...)
        int n = array.length;
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = String.valueOf(array[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    // Troca as strings se estiverem fora de ordem
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        // Convertendo de volta para int após ordenação
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(strings[i]);
        }
    }
	}

	
	

