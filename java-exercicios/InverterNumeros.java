import javax.swing.JOptionPane;

public class InverterNumeros{
	public static void main(String args[]){
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero"));
		int reverso = 0;
		
		while(numero > 0){
			int digito = numero % 10;
			reverso = (reverso * 10) + digito;
			numero = numero / 10;
		}
		
		System.out.println(reverso);
		
	}
}
