import java.util.Scanner;

public class ContarPalavra{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		String palavra = scanner.nextLine();
		String juntar = "";
		
		String palavras[] = palavra.trim().split("\\s+");
		
		System.out.println("Quantidade de palavras: " + palavras.length);
	}
}