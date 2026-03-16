import java.util.Scanner;

class Aniversario{
    int idade;

    void Idade(int idade){
        this.idade = idade;
    }
    void Anonascimento(){;
        System.out.println((2026 - this.idade));
    }
}

public class Teste {
    public static void  main(String []args){
        int idade = 0;
        Aniversario niver;

        niver = new Aniversario();
        Scanner scanner = new Scanner(System.in);

        idade = scanner.nextInt();
        niver.Idade(idade);

        niver.Anonascimento();
    }
}
