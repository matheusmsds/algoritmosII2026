public class Palindromo {
    public static boolean ehPalindromo(String texto) {
        // Remove espaços e converte para minúsculas para comparação precisa
        String clean = texto.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(clean).reverse().toString();
        return clean.equals(invertido);
    }

    public static void main(String[] args) {
        String palavra = "arara";
        System.out.println(palavra + " é palíndromo? " + ehPalindromo(palavra));
    }
}