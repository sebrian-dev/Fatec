public class No {
    private int info;
    private No proximo;
    public No(int info) {
        this.info = info;
        this.proximo = null; //por clareza
    }
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    public int getInfo() {
        return info;
    }
    @Override
    public String toString () {
        // return "[" + info + "," + proximo + "]";
        return "[" + info + "]";
    }  
}