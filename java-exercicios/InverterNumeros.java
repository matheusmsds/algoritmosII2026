import javax.swing.JOptionPane;

public class InverterNumeros{
	public static void main(String args[]){
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
		for(int i = 1; i <= numero; i--){
			System.out.println(numero);
		}
	}

}