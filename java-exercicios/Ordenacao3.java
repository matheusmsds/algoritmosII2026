import java.util.Scanner;

public class Ordenacao3 {
	public static void BuubleSort(int [] array){
		boolean trocou = false;
		int contador = 0;
		
		for(int i = 0; i < array.length - 1; i++){
			trocou = false;
			
			for(int j = 0; j < array.length  - i - 1; j++){
				contador++;
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					trocou = true;
					
				}
				if(!trocou) break;
			}
			System.out.println("Numero de intereações: " + contador);
		}
	}
	
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
	   int numero = scanner.nextInt();
	   int vet[] = new int[3];
	   
	    for (int i = 0; i < vet.length; i++) {
            vet[i] = numero % 10;
            numero = numero / 10;
        }
	   scanner.close();
	   
	   BuubleSort(vet);
	   
		System.out.println(vet[0] + " " +  vet[1] + " " + vet[2]);
    }
}