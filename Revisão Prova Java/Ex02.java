package algoritmos;

import java.util.Scanner;

public class Ex02 {

    
    public static int bubbleSort(int[] vetor) {
    	boolean trocou = false;
    	int contador = 0;
        for(int i = 0; i < vetor.length - 1; i++) {
        	trocou = false;
        	for(int j = 0; j < vetor.length - i - 1; j++) {
        		
        		if(vetor[j] > vetor[j+1]) {
        			int aux = vetor[j];
        			vetor[j] = vetor[j+1];
        			vetor[j+1] = aux;
        			trocou = true;
        			contador++;
        		}
        		if(!trocou) break;
        	}
       
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
      
        int[] vetor = new int[n];   
        
        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }
        
        int trocas = bubbleSort(vetor);
        System.out.println(trocas);
        
        for(int i = 0; i < n; i++) {
        	System.out.println(vetor[i]);
        	if(i < n - 1) {
        		System.out.print("  ");
        	}
        }
        
        sc.close();
    }
}