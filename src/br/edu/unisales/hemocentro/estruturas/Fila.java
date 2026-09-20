package br.edu.unisales.hemocentro.estruturas;

public class Fila<T> {

    private class No {
        T dado;
        No proximo;

        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No primeiro;
    private No ultimo; // ← a novidade
    private int tamanho;

    public Fila() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void enfileirar(T e) {
        No novo = new No(e);
        if (estaVazia()) {
            primeiro = novo;
        } else {
            ultimo.proximo = novo;
        }
        ultimo = novo;
        tamanho++;
    }

    public T desenfileirar() {
        if (estaVazia()) {
            throw new java.util.NoSuchElementException("Fila vazia");
        }
        No removido = primeiro;
        primeiro = removido.proximo;

        if (primeiro == null) {
            ultimo = null;
        }

        T dado = removido.dado;
        removido.proximo = null;
        removido.dado = null;
        tamanho--;
        return dado;
    }

    public T primeiro() {
    } // devolve o dado do primeiro, sem remover (lança exceção se vazia)

    public boolean estaVazia() {
    }

    public int tamanho() {
    }
}
