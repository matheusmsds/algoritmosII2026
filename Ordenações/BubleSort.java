import java.util.Arrays;

public class BubleSort{
	public static void main(String args[]){
		int [] vet = {89,100,67,90};
		int contador = 0;
		boolean trocou = false;
		
		for(int i = 0; i < vet.length - 1; i++){
			trocou = false;
			for(int j = 0; j < vet.length - 1 - i; j++){
				contador++;
				if(vet[j] > vet[j+1]){
					int temp = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = temp;
					trocou = true;
				}
			} 
			if(!trocou) break;
		}
		
		
		System.out.println(contador);
		System.out.println(Arrays.toString(vet));
	}
}