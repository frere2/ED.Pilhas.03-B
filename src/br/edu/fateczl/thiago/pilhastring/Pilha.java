package br.edu.fateczl.thiago.pilhastring;

public class Pilha {
    No topo;

    public Pilha() {
        topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public String push(String n) {
        No ntopo = new No();
        ntopo.valor = n;
        ntopo.proximo = topo;
        topo = ntopo;
        return topo.valor;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        String topv = topo.valor;
        topo = topo.proximo;
        return topv;
    }

    public String top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        return topo.valor;
    }
}
