public class FIla {
    private ListaEncadeada lista = new ListaEncadeada();

    public void push(int valor){
        lista.adicionarFim(valor);
    }

    public void pop(){
        lista.removerInicio();
    }

    public int peek(){
        return lista.pegarInicio();
    }

    public int size(){
        return lista.tamanho;
    }

    public boolean isEmpty(){
        return lista.estaVazia();
    }

    public void print(){
        lista.imprimir();
    }

    public void clear(){
        lista.limpar();
    }
}
