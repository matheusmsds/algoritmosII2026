import java.util.Scanner;

public class RevPrimeiraProva {
    public static void main(String[] args) {
        executarSomaPares();
        executarBubbleSort();
        executarProdutoEscalar();
        executarEncontrarMaior();
    }
    public static void executarSomaPares(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = 0;
        
        for(int i = a; i <= b; i++) {
        	if( i % 2 == 0) {
        		soma += i;
        	}
        }
        System.out.println("A soma dos pares entre " + a + " e " + b + " é " + soma);
        sc.close();
    }

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

    public static void executarBubbleSort() {
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
    
    public static int produtoScalar(int[] a, int[] b, int tamanho){
        int soma = 0;
    	for(int i = 0; i < tamanho; i++){
    		soma += a[i] * b[i];
    	}
    	
    	
        return soma;
    }
    public static void executarProdutoEscalar() {
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

        int resultado = produtoScalar(a, b, n);
        System.out.println(resultado);

        sc.close();
    }

        public static int encontrarMaior(int[] vetor) {
    	int maior = Integer.MIN_VALUE;
    	
        for(int i = 0; i < vetor.length; i++) {
        	if(vetor[i] > maior) {
        		maior = vetor[i];
        	}
        }
        
        return maior;
    }

    public static void executarEncontrarMaior() {
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
