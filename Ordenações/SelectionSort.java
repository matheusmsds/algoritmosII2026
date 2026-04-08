import java.util.Arrays;
public class SelectionSort{
    public static void main(String [] args){
        int vet [] = {4,5,1,3};

        ordenar(vet);


    }
    public static void ordenar(int [] vet){
        
        for(int i = 0; i < vet.length - 1; i++){
            int im = i;
            for(int j = i+1; j < vet.length; j++){
                if(vet[im] > vet[j]){
                    im = j;
                }
            }
            if(im != i){
                int swap = vet[im];
                vet[im] = vet[i];
                vet[i] = swap;
            }
        }
        System.out.println(Arrays.toString(vet));
    }
}