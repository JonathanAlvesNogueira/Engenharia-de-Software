package mergeSort;

import java.util.Arrays;

public class MergeSort {

	// Implementação do Merge Sort para inteiros
    public void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    private  void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
	
	
    
 // Implementação do Merge Sort para strings
    public  void mergeSortString(String[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            String[] left = Arrays.copyOfRange(array, 0, mid);
            String[] right = Arrays.copyOfRange(array, mid, array.length);

            mergeSortString(left);
            mergeSortString(right);

            mergeString(array, left, right);
        }
    }

    private  void mergeString(String[] array, String[] left, String[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) < 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }
	
	
	
	
	
	
}
