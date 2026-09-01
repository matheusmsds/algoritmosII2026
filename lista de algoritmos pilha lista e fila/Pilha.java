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

    public void ePar(){
        Pilha auxiliar = new Pilha();

        while(!this.isEmpty()){
            int elemento = this.pop();

            if(elemento % 2 == 0){
            }else{
                auxiliar.push(elemento);
            }
        }

        while(!auxiliar.isEmpty()){
            this.push(auxiliar.pop());
        }

    }

    public boolean isEmpty(){
        return lista.estaVazia();
    }

    public void clear(){
        lista.limpar();
    }

}
