import javax.swing.JOptionPane;

public class Fatorial{
	public static void main(String []args){
		int fatorial = 1;
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
		for(int i = 1; i <= numero; i++){
			fatorial *= i;
	
		}
		System.out.println(numero + "! " + "= " + fatorial);
	}
}