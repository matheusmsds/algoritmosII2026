import javax.swing.JOptionPane;

public class Temperatura{
	public static void main(String args[]){
		int tempCelsius = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura em CELSIUS"));
		int TempF = (tempCelsius * 9/5) + 32;
		System.out.println(TempF);
	}
}