import javax.swing.JOptionPane;

public class Media{
	public static void main(String args[]){
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro numero"));
		int media = (n1 + n2 + n3) / 3;
		System.out.println(media);
	}
}