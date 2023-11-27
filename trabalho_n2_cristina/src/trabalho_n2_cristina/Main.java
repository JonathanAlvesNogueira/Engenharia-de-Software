package trabalho_n2_cristina;

import java.util.Scanner;

import bubble_sort.BubbleSortNumerico;
import bubble_sort.BubbleSortString;
import bubble_sort.ContextoBubble;
import mergeSort.MergeSort;
import quicksort.QuickSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MergeSort merg = new MergeSort();
		QuickSort quick = new QuickSort();
		
		int[] lista = new int[4];
		lista[0] = 0;
		lista[1] = 9;
		lista[2] = 6;
		lista[3] = 1;

		
		
		String[] lista2 = new String[4];
		lista2[0] = "z";
		lista2[1] = "y";
		lista2[2] = "b";
		lista2[3] = "a";
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("opção 1 Bubble sort Numerico \nopção 2: merge Numerico \nopção 3: quick sort Numerico \n4: Bubble String \n5: Merge String 6: \nQuick String");
		int opc = scan.nextInt();
		
		
		switch(opc) {
			case 1: 
				System.out.println("Você selecionou Bubble Sort numerico");
				 ContextoBubble contextoNumerico = new ContextoBubble(new BubbleSortNumerico());
				int tamanho = lista.length;
				System.out.println("Lista antes:");
				for(int i = 0; i < tamanho; i++ ) {
					System.out.print(lista[i] + "");
				}
				contextoNumerico.executarOrdenacao(lista);
				break;
			case 2: 
				System.out.println("Você selecionou merge Sort numerico");
				int tamanho1 = lista.length;
				System.out.println("Lista antes:");
				for(int i = 0; i < tamanho1; i++ ) {
					
					System.out.print(lista[i] + "");
				}
				merg.mergeSort(lista);
				int tamanho_ = lista.length;
				System.out.println(" \n Lista depois:");
				for(int i = 0; i < tamanho_; i++ ) {
					
					System.out.print(lista[i] + "");
				}
				break;
			case 3: 
				System.out.println("Você selecionou quick Sort numerico");
				int tamanho2 = lista.length;
				System.out.println("Lista antes:");
				for(int i = 0; i < tamanho2; i++ ) {
				
					System.out.print(lista[i] + "");
				}
				
				quick.quickSortNumerico(lista, 0, lista.length-1);
				int tamanho__ = lista.length;
				System.out.println(" \n Lista depois:");
				for(int i = 0; i < tamanho__; i++ ) {
					
					System.out.print(lista[i] + "");
				}
				break;
			case 4: 
				 ContextoBubble contextoBubbleString = new ContextoBubble(new BubbleSortString());
				System.out.println("Você selecionou bubble Sort String");
				int tamanho4 = lista.length;
				System.out.println("Lista antes:");
				for(int i = 0; i < tamanho4; i++ ) {
					System.out.print(lista[i] + "");
				}
				contextoBubbleString.executarOrdenacao(lista2);
				int tamanho4_ = lista.length;
				System.out.println(" \n Lista depois:");
				for(int i = 0; i < tamanho4_; i++ ) {
					System.out.print(lista[i] + "");
				}
				break;
			case 5: 
				System.out.println("Você selecionou quick Sort String");
				int tamanho5 = lista.length;
				System.out.println("Lista antes:");
				for(int i = 0; i < tamanho5; i++ ) {
				
					System.out.print(lista[i] + "");
				}
				
				quick.quickSortNumerico(lista, 0, lista.length-1);
				int tamanho5_ = lista.length;
				System.out.println(" \n Lista depois:");
				for(int i = 0; i < tamanho5; i++ ) {
					
					System.out.print(lista[i] + "");
				}
				break;
			case 6: 
				System.out.println("Você selecionou quick Sort String");
				int tamanho6 = lista.length;
				System.out.println("Lista antes:");
				for(int i = 0; i < tamanho6; i++ ) {
				
					System.out.print(lista[i] + "");
				}
				
				quick.quickSortNumerico(lista, 0, lista.length-1);
				int tamanho6_ = lista.length;
				System.out.println(" \n Lista depois:");
				for(int i = 0; i < tamanho6_; i++ ) {
					
					System.out.print(lista[i] + "");
				}
				break;
			
		}
		
		
		
	}

	
	




}
