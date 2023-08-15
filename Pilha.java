package dados;

public class Pilha {
	
	private int tamanhoMaximo;
	private int topo;
	private int[] vetor;
	
	public Pilha(int tamanho) {
        tamanhoMaximo = tamanho;
        vetor = new int[tamanho];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == tamanhoMaximo - 1;
    }

    public void empilhar(int valor) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia. Não é possível empilhar mais elementos.");
            return;
        }
        topo++;
        vetor[topo] = valor;
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Não é possível desempilhar.");
            return -1; 
        }
        int valorDesempilhado = vetor[topo];
        topo--;
        return valorDesempilhado;
    }

    public int topo() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Não há topo.");
            return -1; 
        }
        return vetor[topo];
    }

    public int tamanho() {
        return topo + 1;
    }

    public void imprimirPilha() {
        System.out.print("Pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

}
}
