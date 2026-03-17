import java.util.Scanner;
import java.util.Arrays;

public class SomaDigitos{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		String temp = Integer.toString(n);
		String[] digitosString = temp.split("");
		int [] digitos = new int[digitosString.length];
		
		for(int i = 0; i < digitosString.length; i++){
			digitos[i] = Integer.parseInt(digitosString[i]);
		}
		
		int soma = 0;
		for(int j = 0; j < digitos.length; j++){
			soma += digitos[j];
		}
		
		System.out.println(soma);
	
		
	}
}