import java.util.Scanner;
public class Revisao{
	public static void main(String [] args){
		   Scanner sc = new Scanner(System.in);

        // Leitura do tamanho e inicialização dos arrays
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < n; i++) b[i] = sc.nextInt();

        // Chama o método e imprime
        System.out.println(produtoEscalar(a, b, n));
        
        sc.close();
		
		
		System.out.println(somaMultiplos3ou5(10));
	}
	public static int somaMultiplos3ou5(int n){
		int soma = 0;
		
		for(int i = 0; i < n; i++){
			if(i % 3 == 0 || i % 5 == 0){
				soma += i;
			}
		}
		return soma;
	}
	public static void SomaParesIntervalo(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
		int soma = 0;
		
		for(int i = a; i <= b; i++){
			if( i % 2 == 0){
				soma += i;
			}
		}
		System.out.println("A soma dos pares entre " + a + " e " + b + " é " + soma);
	}
	public static int contarPalavras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }

        String[] palavras = frase.trim().split("\\s+");
        
        return palavras.length;
    }
	public static int contarConsoantes(String s) {
       String[] vogais = {"a", "e", "i", "o", "u"};
        int contador = 0; // Precisamos de um número para contar
        
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) { // Corrigido: length()
            char c = s.charAt(i);
            
            // Verifica se é uma letra entre 'a' e 'z'
            if (c >= 'a' && c <= 'z') {
                boolean eVogal = false;
                
                // COMPARAÇÃO COM O SEU VETOR:
                // Percorremos o seu vetor para ver se a letra 'c' é uma vogal
                for (String v : vogais) {
                    if (v.equals(String.valueOf(c))) {
                        eVogal = true;
                        break;
                    }
                }
                
                // Se não for vogal, contamos como consoante
                if (!eVogal) {
                    contador++;
                }
            }
        }
        return contador;
    }
	public static void BubbleSort(int array[]){
		int contador = 0;
		boolean trocou = false;
		for(int i = 0; i < array.length - 1; i++){
			trocou = false;
			for(int j = 0; j < array.length - 1 - i; j++){
				contador++;
				if(array[j] > array[j+1]){
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					trocou = true;
				}
					
			}
			if(!trocou) break;
		}
		System.out.println(contador);
	}
	
	 public static int produtoEscalar(int[] a, int[] b, int n) {
        // CONDIÇÃO DE PARADA: Quando chegamos ao índice 0
        if (n <= 0) {
            return 0;
        }
        
        // PASSO RECURSIVO: Multiplica o último par e soma com o resultado do anterior
        // Usamos n-1 para acessar os índices 0 até n-1 do array
        return (a[n - 1] * b[n - 1]) + produtoEscalar(a, b, n - 1);
    }
	
	
	public static void NumeroPerfeito(int numero){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int soma = 0;

        // Encontra os divisores próprios (de 1 até n-1)
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }

        // Verifica se a soma dos divisores é igual ao número original
        if (soma == n && n > 0) {
            System.out.println(n + " é perfeito");
        } else {
            System.out.println(n + " não é perfeito");
        }

        sc.close();
    }
}

