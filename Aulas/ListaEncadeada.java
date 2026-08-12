package algoritmos;

public class ListaEncadeada {

    No inicio;
    int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    private class No {
        int valor;
        No proximo;

        No(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
    
    public int removerInicio() {
        if (inicio == null) return 0;
        int removido = 0;
        removido = inicio.valor;
        inicio = inicio.proximo;
        tamanho--;


        return removido;
    }

    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }
    
    
    public void adicionarFim(int valor) {
        No novo = new No(valor);
        No aux = inicio;
        if (inicio == null) {
            inicio = novo;
        } else {
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novo;
        }
        tamanho++;
    }
    
    
    public boolean estaVazia() {
    	return inicio == null;
    }
    
    public void imprimir() {
        No aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

}
