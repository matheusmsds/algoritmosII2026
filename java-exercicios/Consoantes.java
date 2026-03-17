import java.util.Scanner;

public class Consoantes{
	public static void main(String [] args){
		String vogais = "aeiouAEIOU";
		Scanner scanner = new Scanner(System.in);
		String palavra = scanner.nextLine();
		int contador = 0;
		
		for(char c : palavra.toCharArray()){
			if(Character.isLetter(c) && !vogais.contains(String.valueOf(c)))
				contador++;
		}
	
		System.out.println(contador);
	}
}