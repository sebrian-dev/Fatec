public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    // Construtor padrão
    public boolean estVazia() {
        return primeiro == null;
    }
    public void insereInicio (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estVazia()){
            ultimo = novo;
        }
        else {
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }
    public void insereFim (int info) {
        NoDuplo novo = new NoDuplo(info);
        if (estVazia()){
            primeiro = novo;
        }
        else {
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
    }
    public int removePrimeiro() {
        if (estVazia()) return -1;
        int copia = primeiro.getInfo();
        primeiro = (NoDuplo)primeiro.getProximo();
        if (primeiro == null) { // Esvaziou a lista
            ultimo = null;
        }
        else {
            primeiro.setAnterior(null);
        }
        return copia;
    }
    public int removeUltimo() {
        if (estVazia()) return -1;
        int copia = ultimo.getInfo();
        ultimo = ultimo.getAnterior();
        if (ultimo == null) { // Esvaziou a lista
            primeiro = null;
        }
        else {
            ultimo.setProximo(null);
        }
        return copia;
    }
    @Override 
    public String toString () {
        if (estVazia()) return "Lista Vazia";
        StringBuilder sBuilder = new StringBuilder();
        NoDuplo runner = primeiro;
        while (runner != null) {
            sBuilder.append(runner + " ");
            runner = (NoDuplo)runner.getProximo();
        }
        sBuilder.append("//");
        return new String(sBuilder);
    }
}
