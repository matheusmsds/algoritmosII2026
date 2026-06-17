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

    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }

    public void removerPorIndice(int indice){
        int cont = 0;
        No aux = inicio;

        while(cont != indice - 1){
            if(aux == null) return;
            aux = aux.proximo;
            cont++;
        }
        aux.proximo = aux.proximo.proximo;
        tamanho--;
    }

    public void adicionarAposElemento(int valor, int valorReferencia) {
        if (inicio == null)
            return;
        No aux = inicio;
        while (aux != null && aux.valor != valorReferencia) {
            aux = aux.proximo;
        }
        if (aux == null) {
            throw new ElementoNaoEncontrado("Elemento não econtrado");
        }
        No novo = new No(valor);
        novo.proximo = aux.proximo;
        aux.proximo = novo;
        tamanho++;
    }

    public void adicionarFinal(int valor) {
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

    public void removerInicio() {
        if (inicio == null)
            return;
        inicio = inicio.proximo;
        tamanho--;
    }

    public void removerFim() {
        if (inicio == null)
            return;
        if (inicio.proximo == null) {
            inicio = null;
        } else {
            No aux = inicio;
            while (aux.proximo.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = null;
        }
        tamanho--;
    }

    public void imprimir() {
        No aux = inicio;
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.proximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.removerPorIndice(1);
        lista.adicionarInicio(10);
        lista.adicionarInicio(20);
        lista.adicionarInicio(100);
        lista.adicionarFinal(14);
        try {
            lista.adicionarAposElemento(5, 13);
        } catch (ElementoNaoEncontrado e) {
            System.out.println(e.getMessage());
        }
        lista.removerInicio();
        lista.removerFim();
        lista.imprimir();
        lista.removerPorIndice(100);

    }

}
