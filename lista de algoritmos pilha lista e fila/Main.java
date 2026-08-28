public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        for(int i = 0; i < 10; i++){
            lista.adicionarInicio(i+10);
        }

        lista.imprimir();

        System.out.println(lista.pegarMaior());
        System.out.println(lista.pegarMenor());
    }

    public static void armazenarPilha(){
        Pilha pilha = new Pilha();

        for(int i = 0; i < 5; i++){
            pilha.push(i+1);
        }

        System.out.println();

        pilha.print();

    }

    public static void armazenarFila(){
        Fila fila = new Fila();

        for(int i = 0; i < 5; i++){
            fila.push(i+1);
        }

        System.out.println();

        fila.print();

    }


}
