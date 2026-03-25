package algoritmos;

import java.util.Scanner;

public class Ex03 {

    
    public static int produtoEscalar(int[] a, int[] b, int tamanho) {
    	int soma = 0;
    	for(int i = 0; i < tamanho; i++){
    		soma += a[i] * b[i];
    	}
    	
    	
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int resultado = produtoEscalar(a, b, n);
        System.out.println(resultado);

        sc.close();
    }
}