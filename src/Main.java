public static void main(String[] args) {

    Lista no1 = new Lista(1);
    Lista no2 = new Lista(2);
    Lista no3 = new Lista(3);

    no1.setProximo(no2);
    no2.setAnterior(no1);
    no2.setProximo(no3);
    no3.setAnterior(no2);

    System.out.println("Lista do início para o fim:");
    Lista atual = no1;
    while (atual != null) {
        System.out.print(atual.getElemento() + " ");
        atual = atual.getProximo();
    }

    System.out.println("\nLista do fim para o início:");
    atual = no3;
    while (atual != null) {
        System.out.print(atual.getElemento() + " ");
        atual = atual.getAnterior();
    }

    Fila fila = new Fila();

    System.out.println("Fila vazia? " + fila.vazio()); // true

    fila.enfileirar(1);
    fila.enfileirar(2);
    fila.enfileirar(3);

    System.out.println("Fila após enfileirar 1, 2, 3: " + fila);

    System.out.println("Desenfileirado: " + fila.desenfileirar());
    System.out.println("Fila após desenfileirar: " + fila);

    System.out.println("Desenfileirado: " + fila.desenfileirar());
    System.out.println("Fila após desenfileirar: " + fila);

    System.out.println("Fila vazia? " + fila.vazio()); // false

    System.out.println("Desenfileirado: " + fila.desenfileirar());
    System.out.println("Fila após desenfileirar: " + fila);

    System.out.println("Fila vazia? " + fila.vazio());

    Pilha pilha = new Pilha();

    System.out.println("Pilha vazia? " + pilha.vazio());

    pilha.empilhar(1);
    pilha.empilhar(2);
    pilha.empilhar(3);

    System.out.println("Pilha após empilhar 1, 2, 3: " + pilha);

    System.out.println("Desempilhado: " + pilha.desempilhar());
    System.out.println("Pilha após desempilhar: " + pilha);

    System.out.println("Desempilhado: " + pilha.desempilhar());
    System.out.println("Pilha após desempilhar: " + pilha);

    System.out.println("Pilha vazia? " + pilha.vazio());

    System.out.println("Desempilhado: " + pilha.desempilhar());
    System.out.println("Pilha após desempilhar: " + pilha);

    System.out.println("Pilha vazia? " + pilha.vazio());
}
