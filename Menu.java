package dados;

public class Menu {

	public static void main(String[] args) {
		 Pilha pilha = new Pilha(5);

	        pilha.empilhar(10);
	        pilha.empilhar(20);
	        pilha.empilhar(30);

	        pilha.imprimirPilha();

	        System.out.println("Topo: " + pilha.topo()); 

	        pilha.desempilhar();
	        pilha.imprimirPilha(); 

	        System.out.println("Tamanho da pilha: " + pilha.tamanho());
	        
	        
	        Fila fila = new Fila(5);

	        fila.enfileirar(10);
	        fila.enfileirar(20);
	        fila.enfileirar(30);

	        fila.imprimirFila(); 

	        System.out.println("Frente: " + fila.frente());

	        fila.desenfileirar();

	        fila.imprimirFila(); 

	        System.out.println("Tamanho da fila: " + fila.tamanho());
	        
	        ListaCircular lista = new ListaCircular();

	        lista.inserirNoInicio(10);
	        lista.inserirNoInicio(20);
	        lista.inserirNoInicio(30);

	        lista.imprimirLista();
	    }

	}

