package pilha;

public class Pilha {
    private int[] dados;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        dados = new int[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }

    public boolean estaVazia() {
        return topo == 0;
    }

    public boolean estaCheia() {
        return topo == capacidade;
    }

    public int tamanho() {
        return topo;
    }

    public boolean empilha(int i) {
        if (estaCheia()) {
            return false;
        } else {
            dados[topo++] = i;
            //topo++;
            return true;
        }
    }
    public int desempilha() {
        if (estaVazia())
            return -1;
        else {
            //topo--;
            return dados[--topo];
        }
    }
    @Override
    public String toString (){
        if (estaVazia()) return "pilha vazia";
        String s = "";
        for (int i=topo-1; i>= 0; i--){
            s += dados[i] + " ";
        }
        return s;
    }
}
