public class ListaEncadeada {
    No inicio;
	int tamanho;


	private static class No {
        int valor;
        No proximo;
        public No(int valor) { this.valor = valor; }
    }

	public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public void adicionarFim(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
        	inicio = novo;
            return;
        }
        No t = inicio;
        while (t.proximo != null) t = t.proximo;
        t.proximo = novo;
    }

	public boolean estaNaLista(int valor){
		return pegarNalista(valor, this.inicio);
	}

	public boolean pegarNalista(int valor, No lista){
		if(lista == null) return false;
	
		return (valor == lista.valor) ? true: pegarNalista(valor, lista.proximo);
	}


    public void imprimir() {
        No t = inicio;
        while (t != null) {
            System.out.print(t.valor + " -> ");
            t = t.proximo;
        }
        System.out.println("null");
    }

	public int pegarFinal(){
		No atual = this.inicio;

		while(atual.proximo != null){
			atual = atual.proximo;
		}

		return atual.valor;
	}
    // implemente este método usando recursão
    public int contarRecursivo(int valor) {
        return contarRecursivo(valor, inicio);
    }
    
    private int contarRecursivo(int valor, No lista) {
    	if(lista == null) return 0;
    	return (lista.valor == valor ? 1 : 0)+contarRecursivo(valor, lista.proximo);
    }
    
    public ListaEncadeada clone() {
    	No aux = inicio;
    	ListaEncadeada clone = new ListaEncadeada();
    	while(aux!=null) {
    		clone.adicionarFim(aux.valor);
    		aux = aux.proximo;
    	}
    	return clone;
    }
    
	public int removerInicio() {
        if (inicio == null) return 0;
        int removido = 0;
        removido = inicio.valor;
        inicio = inicio.proximo;
        tamanho--;

        return removido;
    }

	public int pegarInicio(){
		return inicio.valor;
	}


    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }
        
    public boolean estaVazia() {
    	return inicio == null;
    }

    public int removerTodos(int valor) {
    	int contador = 0;
    	while(inicio!=null && inicio.valor==valor) {
    		inicio = inicio.proximo;
    		contador++;
    	}
    	if(inicio==null) return contador;
    	No aux = inicio;
    	while(aux.proximo !=null) {
    		if(aux.proximo.valor==valor) {
    			contador++;
    			aux.proximo = aux.proximo.proximo;
    		}else {
    			aux = aux.proximo;
    		}
    	}
    	return contador;
    }

	public void limpar(){
		this.inicio = null;
        this.tamanho = 0;
	}

    
    public ListaEncadeada elementosPosicaoPar() {
    	ListaEncadeada novaLista = new ListaEncadeada();
    	int indice=0;
    	No aux = inicio;
    	while(aux!=null) {
    		if(indice%2 == 0) {
    			novaLista.adicionarFim(aux.valor);
    		}
    		indice++;
    		aux = aux.proximo;
    	}
    	return novaLista;
	
	}

	public int elemetosLista(){
		return this.tamanho;
    }
    
    // public static void main(String[] args) {
	// 	ListaEncadeada lista = new ListaEncadeada();
	// 	lista.adicionarFim(10);
	// 	lista.adicionarFim(11);
	// 	lista.adicionarFim(15);
	// 	//System.out.println(lista.contarRecursivo(11));
	// 	//lista.imprimir();
	// 	//System.out.println(lista.removerTodos(10));
	// 	//lista.imprimir();
		
	// 	ListaEncadeada posicaoPar = lista.elementosPosicaoPar();
	// 	lista.imprimir();
	// 	posicaoPar.imprimir();
		
		
	// 	/*ListaEncadeada novaLista = lista.clone();
	// 	novaLista.imprimir();
	// 	novaLista.adicionarFim(100);
	// 	novaLista.imprimir();
	// 	lista.imprimir();*/
		
	// }
}