package listas;


public class ListaEncadeada {
	
	No inicio;
	int tamanho;
	
	public ListaEncadeada() {
		this.inicio = null;
		this.tamanho = 0;
	}
	
	public void adicionarInicio(int valor) {
		No novo = new No(valor);
		novo.proximo = inicio;
		inicio = novo;
		tamanho++;
	}
	public void removerInicio() {
		if(inicio == null) return;
		inicio = inicio.proximo;
		
	}
	public void removerFim() {
		if(inicio == null) return;
		if(inicio.proximo == null) {
			inicio = null;
		}else {
			No aux = inicio;
			while(aux.proximo.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = null;
		}
		tamanho--;
	}
	public void adicionarFim(int valor) {
		No novo = new No(valor);
		if(inicio == null) {
			inicio = novo;
		}else {
			No aux = inicio;
			while(aux.proximo != null) {
				aux = aux.proximo;
			}
			aux.proximo = novo;
		}
		tamanho++;
	}
	
	public void imprimir() {
		No aux = inicio;
		while(aux!=null) {
			System.out.print(aux.valor+" ");
			aux = aux.proximo;			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.adicionarInicio(10);
		lista.adicionarInicio(20);
		lista.adicionarFim(5);
		lista.adicionarInicio(100);
		lista.removerInicio();
		lista.imprimir();
	}
	
	private class No{
		int valor;
		No proximo;
		No(int valor){
			this.valor = valor;
			this.proximo = null;
		}
	}
}
