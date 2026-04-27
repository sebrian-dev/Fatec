public class Lista {
    private No primeiro;
    // Construtor é o padrão
    public boolean listaVazia() {
        return primeiro == null;
    }
    public void insereInicio(int info) {
        No novo = new No(info);
        if(!listaVazia()){
            novo.setProximo(primeiro);
        }
        primeiro = novo;
    }
    public int removeInicio() throws Exception {
        if (listaVazia())
            throw new ListaVaziaException();
        else {
            int temp = primeiro.getInfo();
            primeiro = primeiro.getProximo();
            return temp;
        }
    }
    public void insereFim(int info) {
        No novo = new No(info);
        if (listaVazia())
            primeiro = novo;
        else {
            No runner = primeiro;
            while (runner.getProximo() != null){
                runner = runner.getProximo();
            }
            runner.setProximo(novo);
        }
    }
    public int removeFim() throws Exception{
        if(listaVazia())
            throw new ListaVaziaException();
        else if (primeiro.getProximo() == null) { // Tem um só
            int temp = primeiro.getInfo();
            primeiro = null; // Esvaziou a Lista
            return temp;
        }
        else{
            No runner = primeiro;
            while (runner.getProximo().getProximo() != null) { // Penúltimo
                runner = runner.getProximo();
            }
            int temp = runner.getProximo().getInfo();
            runner.setProximo(null);
            return temp;
        }
    }
    @Override
    public String toString () {
        if(listaVazia()) return "Lista Vazia";
        String s = "";
        No runner = primeiro;
        while (runner != null) { // Vai até o fim da Lista
            s += runner.getInfo() + "->";
            runner = runner.getProximo();
        }
        return s + "//";
    }
}
class ListaVaziaException extends Exception{
    public ListaVaziaException (){
       super("Lista está vazia"); 
    }
}