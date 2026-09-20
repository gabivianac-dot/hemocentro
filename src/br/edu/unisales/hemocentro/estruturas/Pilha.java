package br.edu.unisales.hemocentro.estruturas;

public class Pilha<T> {

    private class No {
        T dado;
        No proximo;

        No(T dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    private No topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void empilhar(T e) {
        No novo = new No(e);
        novo.proximo = topo;   // o nó novo passa a apontar para quem era o topo
        topo = novo;           // e vira o novo topo
        tamanho++;
    }

    public T desempilhar() {
        if (estaVazia()) {
            throw new java.util.NoSuchElementException("Pilha vazia");
        }
        No removido = topo;
        topo = removido.proximo;      // o topo passa a ser o de baixo

        T dado = removido.dado;
        removido.proximo = null;      // gerenciamento de memória
        removido.dado = null;
        tamanho--;
        return dado;
    }

    public T topo() {
        if (estaVazia()) {
            throw new java.util.NoSuchElementException("Pilha vazia");
        }
        return topo.dado;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }
}