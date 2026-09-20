package br.edu.unisales.hemocentro.estruturas;

public class Deque<T> {

    private class No {
        T dado;
        No anterior;
        No proximo;

        No(T dado) {
            this.dado = dado;
            this.anterior = null;
            this.proximo = null;
        }
    }

    private No primeiro;
    private No ultimo;
    private int tamanho;

    public Deque() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void inserirInicio(T e) {
        No novo = new No(e);
        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
        }
        tamanho++;
    }

    public void inserirFim(T e) {
        No novo = new No(e);
        if (estaVazia()) {
            primeiro = novo;
            ultimo = novo;
        } else {
            novo.anterior = ultimo;
            ultimo.proximo = novo;
            ultimo = novo;
        }
        tamanho++;
    }

    public T removerInicio() {
        if (estaVazia()) {
            throw new java.util.NoSuchElementException("Deque vazio");
        }
        No removido = primeiro;
        primeiro = removido.proximo;

        if (primeiro == null) {
            ultimo = null;
        } else {
            primeiro.anterior = null;
        }

        T dado = removido.dado;
        removido.proximo = null;
        removido.anterior = null;
        removido.dado = null;
        tamanho--;
        return dado;
    }

    public T removerFim() {
        if (estaVazia()) {
            throw new java.util.NoSuchElementException("Deque vazio");
        }
        No removido = ultimo;
        ultimo = removido.anterior;

        if (ultimo == null) {
            primeiro = null;
        } else {
            ultimo.proximo = null;
        }

        T dado = removido.dado;
        removido.proximo = null;
        removido.anterior = null;
        removido.dado = null;
        tamanho--;
        return dado;
    }

    public T primeiro() {
        if (estaVazia()) {
            throw new java.util.NoSuchElementException("Deque vazio");
        }
        return primeiro.dado;
    }

    public T ultimo() {
        if (estaVazia()) {
            throw new java.util.NoSuchElementException("Deque vazio");
        }
        return ultimo.dado;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}