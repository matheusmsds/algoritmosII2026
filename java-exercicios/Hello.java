import javax.swing.JOptionPane;

public class Hello {
    public static void main(String[] args) {
        int qtd, media;

        qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de números: "));
        int[] numeros = new int[qtd];

        preencherNumeros(numeros);
        media = mediaNumeros(numeros);

        System.out.println("Média dos numeros: " + media);
    }

    public static void preencherNumeros(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero: " + (i + 1)));
        }
        mostrarNumeros(numeros);
    }

    public static void mostrarNumeros(int[] numeros){
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    private static int mediaNumeros(int[] numeros){
        int soma = 0;
        for(int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        return soma/numeros.length;
    }
}