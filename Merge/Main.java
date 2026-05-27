import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int vetor[] = {5,4,3,2,1};
        Merge merge = new Merge();
        merge.mergeSort(0, vetor.length - 1, vetor);
        System.out.println(Arrays.toString(vetor));
    }
}