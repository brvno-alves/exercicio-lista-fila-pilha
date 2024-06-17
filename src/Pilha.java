public class Pilha {
    private ListaDuplamenteEncadeada elemento;

    public Pilha() {
        this.elemento = new ListaDuplamenteEncadeada();
    }

    public boolean vazio() {
        return this.elemento.tamanho() == 0;
    }

    public void empilhar(Object elemento) {
        this.elemento.adiciona(elemento);
    }

    public Object desempilhar() {
        if (this.elemento.tamanho() == 0) {
            return null;
        }
        Object resultado = this.elemento.Localiza(this.elemento.tamanho() - 1);
        this.elemento.removeDoFim();
        return resultado;
    }

    @Override
    public String toString() {
        return "Pilha [elemento=" + elemento + "]";
    }
}
