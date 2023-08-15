package dados;

public class ListaCircular {
	
	private No cabeca;

    public ListaCircular() {
        cabeca = null;
    }

    public boolean estaVazia() {
        return cabeca == null;
    }

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        if (cabeca == null) {
            cabeca = novoNo;
            cabeca.proximo = cabeca; // Lista circular aponta para si mesma
        } else {
            No temp = cabeca;
            while (temp.proximo != cabeca) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
            novoNo.proximo = cabeca;
            cabeca = novoNo;
        }
    }

    public void imprimirLista() {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
            return;
        }
        No atual = cabeca;
        do {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        } while (atual != cabeca);
        System.out.println();
    }

}
