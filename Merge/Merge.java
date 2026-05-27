public class Merge {
    public void mergeSort(int inicio, int fim, int vet [] ){
        if(inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio, vet);
            mergeSort(meio+1, fim, vet);
            merge(inicio, meio, fim, vet);

        }
    }
    private static void merge(int inicio, int meio, int fim, int[] vetor){
        int aux[] = new int[vetor.length];
        int i = inicio;
        int m = meio + 1;
        int y = inicio;

        while (i <= meio && m <= fim) {
            if (vetor[i] <= vetor[m]) {
                aux[y] = vetor[i];
                i++; 
                y++;
            }else{
                aux[y] = vetor[m];
                m++;
                y++;
            }
        }
        //copiar a parte da direita que sobrou
        while (i <= meio) {
            aux[y] = vetor[i];
            i++;
            y++;
        }
        //copiar a parte da  esquerda que sobrou
        while (m <= fim ) {
            aux[y] = vetor[m];
            m++;
            y++;
        }
        for(int x = inicio; x <= fim; x++){
            vetor[x] = aux[x];
        }
    }
}
