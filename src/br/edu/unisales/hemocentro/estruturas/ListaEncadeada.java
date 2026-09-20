package br.edu.unisales.hemocentro.estruturas;

public class ListaEncadeada<T> {
private class No {
    T dado;
    No proximo;

    No(T dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
private No primeiro;
private int tamanho;

public ListaEncadeada() {
    this.primeiro = null;
    this.tamanho = 0;
}
public boolean estaVazia() {
    // devolve true quando é 0
    return tamanho == 0;
}
public int tamanho() {
    // devolve o tamanho
    return tamanho;
}
public void inserirInicio(T e) {
    // 1. criar um novo com e
    // 2. proximo do nó novo aponta para o antigo primeiro
    // 3. primeiro vira o nó novo; tamanho aumenta 1
    No novo = new No(e);
    novo.proximo = primeiro;
    primeiro = novo;
    tamanho++;
}
public void inserirFim(T e) {
    No novo = new No(e);
    if (estaVazia()) {
        primeiro = novo;
    } else {
        No atual = primeiro;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novo;
    }
    tamanho++;
}
public T obter(int indice) {
    if (indice < 0 || indice >= tamanho) {
        throw new IndexOutOfBoundsException("Posição inválida: " + indice);
    }
    No atual = primeiro;
    for (int i = 0; i < indice; i++) {
        atual = atual.proximo;
    }
    return atual.dado;
} 
public T remover(int indice) {
    if (indice < 0 || indice >= tamanho) {
        throw new IndexOutOfBoundsException("Posição inválida: " + indice);
    }

    No removido;

    if (indice == 0) {
        removido = primeiro;
        primeiro = removido.proximo;
    } else {
        No anterior = primeiro;
        for (int i = 0; i < indice - 1; i++) {
            anterior = anterior.proximo;
        }
        removido = anterior.proximo;
        anterior.proximo = removido.proximo;
    }

    T dado = removido.dado;

    // gerenciamento de memória: solta as referências do nó removido
    removido.proximo = null;
    removido.dado = null;

    tamanho--;
    return dado;
}
public boolean contem(T e) {
    No atual = primeiro;
    while (atual != null) {
        if (atual.dado.equals(e)) {
            return true;
        }
        atual = atual.proximo;
    }
    return false;
}
}  

