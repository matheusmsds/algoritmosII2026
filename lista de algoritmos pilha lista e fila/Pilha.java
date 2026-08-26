public class Pilha {
    private ListaEncadeada lista = new ListaEncadeada();

    public void push(int valor){
        lista.adicionarInicio(valor);
    }

    public int pop(){
        return lista.removerInicio();
    }

    public int peek(){
        return lista.pegarInicio();
    }

    public void print(){
        lista.imprimir();
    }

    public int size(){
        return lista.tamanho;
    }

    public boolean isEmpty(){
        return lista.estaVazia();
    }

    public void clear(){
        lista.limpar();
    }

}
