public class Recursao{
    public static void main(String[] args) {
        int [] numero = {1,2,3};
        int soma = VetorSomaN(numero);

        System.out.println(soma);
       
    }

    public static int SomarNumeroAteN(int numero){
        
        if (numero == 0) return 0;
        return numero + SomarNumeroAteN(numero - 1);
    }
    
    public static int Fatorial(int numero){
        if (numero == 1) return 1;

        return numero * Fatorial(numero - 1);
    }

    public static void NumerosAteN(int numero){
        System.out.println(numero);
        if (numero > 0) NumerosAteN(numero - 1);
        
    }

    public static int VetorSomaN(int [] numero){
        int i = 0;
        if (i > numero.length) return i;
        i++;
        return numero[i] + VetorSomaN(numero);
        //terminar de fazer
    }
}