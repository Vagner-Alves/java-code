package dados;

public class Fila {
	
	private int tamanhoMaximo;
    private int tamanhoAtual;
    private int inicio;
    private int fim;
    private int[] vetor;

    public Fila(int tamanho) {
        tamanhoMaximo = tamanho;
        vetor = new int[tamanho];
        tamanhoAtual = 0;
        inicio = 0;
        fim = -1;
    }

    public boolean estaVazia() {
        return tamanhoAtual == 0;
    }

    public boolean estaCheia() {
        return tamanhoAtual == tamanhoMaximo;
    }

    public void enfileirar(int valor) {
        if (estaCheia()) {
            System.out.println("A fila está cheia. Não é possível enfileirar.");
            return;
        }
        fim = (fim + 1) % tamanhoMaximo;
        vetor[fim] = valor;
        tamanhoAtual++;
    }

    public int desenfileirar() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
            return -1; 
        }
        int valorDesenfileirado = vetor[inicio];
        inicio = (inicio + 1) % tamanhoMaximo;
        tamanhoAtual--;
        return valorDesenfileirado;
    }

    public int frente() {
        if (estaVazia()) {
            System.out.println("A fila está vazia. Não há elemento na frente.");
            return -1; 
        }
        return vetor[inicio];
    }

    public int tamanho() {
        return tamanhoAtual;
    }

    public void imprimirFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.print("Fila: ");
        int indice = inicio;
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.print(vetor[indice] + " ");
            indice = (indice + 1) % tamanhoMaximo;
        }
        System.out.println();

}
}
