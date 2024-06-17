public class Lista {

    private Object elemento;
    private Lista proximo;
    private Lista anterior;

    public Lista(Lista proximo, Object elemento) {
        this.proximo = proximo;
    }

    public void setProximo(Lista proximo) {
        this.proximo = proximo;
    }

    public Lista getProximo() {
        return proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public Lista getAnterior() {
        return anterior;
    }

    public void setAnterior(Lista anterior) {
        this.anterior = anterior;
    }

    public Lista(Object elemento) {
        this(null, elemento);
    }
}
