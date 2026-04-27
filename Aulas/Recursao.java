public class Recursao{
    public static void main(String[] args) {
        int [] numero = {1,2,3, 3};
        int soma = ContarN(numero, 3, 0);
        System.out.println(soma);
       
    }

    public static int SomarNumeroAteN(int numero){
        if (numero == 0) return 0;
        return numero + SomarNumeroAteN(numero - 1);
    }
    
    public static int Fatorial(int numero){
        if (numero == 1) return 1;
        return numero * Fatorial(numero - 1);

    }

    public static void NumerosAteN(int numero){
        System.out.println(numero);
        if (numero > 0) NumerosAteN(numero - 1);
        
    }

    public static int VetorSomaN(int [] numero, int i){
        if (i >= numero.length) return 0;
        return numero[i] + VetorSomaN(numero, i + 1);
    
    }
    public static int MaiorElemento(int [] vetor, int n){
        if (n ==1) {
            return vetor[0];
        }
        int maxRestante = MaiorElemento(vetor, n - 1);

        return Math.max(vetor[n - 1], maxRestante);
    }

    public static int ContarN(int [] vetor, int alvo, int i){
        if (i == vetor.length) {
            return 0;
        }
        int count = 0;

        if (vetor[i] == alvo) {
            count++;
        }

        return count + ContarN(vetor, alvo, i + 1);
    
    }

    public static String inverter(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }


        return inverter(str.substring(1)) + str.charAt(0);
    }

    public static int somarDigitos(int n) {
        if (n == 0) {
            return 0;
        }

        // Recursão: pega o último dígito (n % 10) e soma com o resto do número (n / 10)
        return (n % 10) + somarDigitos(n / 10);
    }

    public static boolean ehPalindromo(String str) {
        // Caso base: se a string tem 0 ou 1 caractere, ela é palíndroma
        if (str.length() <= 1) {
            return true;
        }

        // Verifica se as pontas são iguais
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // Recursão: testa a substring removendo a primeira e a última letra
            return ehPalindromo(str.substring(1, str.length() - 1));
        }

        // Se as pontas forem diferentes, não é palíndromo
        return false;
    }
}
