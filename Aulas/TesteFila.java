package algoritmos;

public class TesteFila {
	public static void main(String [] args) {
		Fila fila = new Fila();
		
		fila.enfileirar(10);
		fila.enfileirar(50);
		fila.enfileirar(3);
		
		fila.imprimir();
		
		fila.desenfileirar();
		
		fila.imprimir();
		
		
	}
}
