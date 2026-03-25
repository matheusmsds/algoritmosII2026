import java.util.Scanner;

public class Ex04 {

    
    public static int encontrarMaior(int[] vetor) {
    	int maior = vetor[0];
    	
        for(int i = 0; i < vetor.length; i++) {
        	if(vetor[i] > maior) {
        		maior = vetor[i];
        	}
        }
        
        return maior;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextInt();
        }

        int resultado = encontrarMaior(vetor);
        System.out.println("O maior número do vetor é " + resultado);

        sc.close();
    }
}