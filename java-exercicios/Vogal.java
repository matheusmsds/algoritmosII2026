import java.util.Scanner;

public class Vogal{
	public static void main(String [] args){
		String vogais = "aeiouAEIOU";
		Scanner scanner = new Scanner(System.in);
		String palavra = scanner.nextLine();
		String juntar = "";
		int contador = 0;
		
		for(char c : palavra.toCharArray()){
			if(vogais.indexOf(c) != -1){
				juntar = juntar + c;
				contador++;
			}
		}
		
		System.out.println("Quantidade de vogais: " + contador);
		System.out.println(juntar);
	}
}