public class ListaDuplamenteEncadeada {

    private Lista primeira;
    private int totalDeElementos;
    private Lista ultima;

    public void adicionaNoComeco(Object elemento) {
        if (this.totalDeElementos == 0) {
            Lista novaLista = new Lista(elemento);
            this.primeira = novaLista;
            this.ultima = novaLista;
        } else {
            Lista novaLista = new Lista(this.primeira, elemento);
            this.primeira = novaLista;
            this.primeira.setAnterior(novaLista);
            this.totalDeElementos++;
        }
    }

    public void adiciona(Object elemento) {
        if (this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Lista novaLista = new Lista(elemento);
            this.ultima.setProximo(novaLista);
            novaLista.setAnterior(this.ultima);
            this.ultima = novaLista;
            this.totalDeElementos++;
        }
    }

    public void adiciona(int posicao, Object elemento) {
        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == this.totalDeElementos) {
            this.adiciona(elemento);
        } else {
            Lista anterior = busca(posicao - 1);
            Lista proxima = anterior.getProximo();
            Lista novaLista = new Lista(anterior.getProximo(), elemento);
            novaLista.setAnterior(anterior);
            anterior.setProximo(novaLista);
            proxima.setAnterior(novaLista);
            this.totalDeElementos++;
        }
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }

    private Lista busca(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }
        Lista atual = primeira;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }

    public void removeDoComeco() {
        if (this.totalDeElementos == 0) {
            throw new IllegalArgumentException("lista vazia");
        }
        this.primeira = this.primeira.getProximo();
        this.totalDeElementos--;
        if (this.totalDeElementos == 0) {
            this.ultima = null;
        }
    }

    public void removeDoFim() {
        if (this.totalDeElementos == 1) {
            this.removeDoComeco();
        } else {
            Lista penultima = this.ultima.getAnterior();
            penultima.setProximo(null);
            this.ultima = penultima;
            this.totalDeElementos--;
        }
    }

    public void remove(int posicao) {
        if (posicao == 0) {
            this.removeDoComeco();
        } else if (posicao == this.totalDeElementos - 1) {
            this.removeDoFim();
        } else {
            Lista anterior = this.busca(posicao - 1);
            Lista atual = anterior.getProximo();
            Lista proxima = atual.getProximo();
            anterior.setProximo(proxima);
            proxima.setAnterior(anterior);
            this.totalDeElementos--;
        }
    }

    public int tamanho() {
        return this.totalDeElementos;
    }

    public boolean Localiza(Object elemento) {
        Lista atual = this.primeira;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0) {
            return "()";
        }
        Lista atual = primeira;
        StringBuilder builder = new StringBuilder("(");
        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");
            atual = atual.getProximo();
        }
        builder.append(")");
        return builder.toString();
    }
}
