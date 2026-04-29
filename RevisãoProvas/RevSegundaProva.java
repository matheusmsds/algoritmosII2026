public class RevSegundaProva {
    public static void main(String[] args) {
        int  [] a = {1,2,3,4};
        int [] b = {2,4,8,16};
        int [] vet = {-1, 2, 4, 12};
        String [] palavras = {"Abelha","Folha","Casa","Terra","Ouro","Rica"};
        
        System.out.println(escalarRecur(a, b, a.length));
        System.out.println(somaEspecial(vet, vet.length));
        
        imprimirArray(palavras);
        ordernarPorInsercao(palavras);
        imprimirArray(palavras);
    }
    public static int escalarRecur(int [] a ,int [] b, int tamanho){
        if(tamanho == 0) return 0;

        return (a[tamanho - 1] * b[tamanho - 1]) + escalarRecur(a, b, tamanho - 1);
    }

    public static int somaEspecial(int vet [], int tamanho){
        // não lembro sobre a questão da soma para numeros pares, se era valor * idx ou valor + idx.
        if (tamanho <= 0) return 0;

        int idx = tamanho - 1;
        int valor = vet[idx];
        int soma = 0;

        if (valor < 0) {
            valor = 0;
        }
        else if (valor % 2 == 0) {
            soma = (valor * idx) + idx;
        } else {
            soma = valor;
        }

        return soma + somaEspecial(vet, tamanho - 1);
    }
    public static void ordernarPorInsercao(String[] array) {
        // Começamos do segundo elemento (índice 1)
        for (int i = 1; i < array.length; i++) {
            String chave = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(chave) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }

    public static void imprimirArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
