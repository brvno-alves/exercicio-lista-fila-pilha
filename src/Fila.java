public class Fila {
    private ListaDuplamenteEncadeada elemento;

    public Fila() {
        this.elemento = new ListaDuplamenteEncadeada();
    }

    public boolean vazio() {
        return this.elemento.tamanho() == 0;
    }

    public void enfileirar(Object elemento) {
        this.elemento.adiciona(elemento);
    }

    public Object desenfileirar() {
        if (this.elemento.tamanho() == 0) {
            return null;
        }
        Object resultado = this.elemento.Localiza(this.elemento.tamanho() - 1);
        this.elemento.removeDoComeco();
        return resultado;
    }

    @Override
    public String toString() {
        return "Fila[elemento=" + elemento + "]";
    }
}
