import javax.swing.JOptionPane;

public class DecimalParaBinario{
	public static void main(String args[]){
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
		String binario = "";
		
		if(numero == 0){
			binario = "0";
		}
		
		
		while(numero > 0){
			int resto = numero % 2;
			binario = binario + resto;
			numero = numero / 2;
		}
		
		System.out.println(binario);
		
	}
}
