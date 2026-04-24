 import java.util.Random;
 
 public class NossoVetor {
    private int[] v;
    private int capacidade;
    private int ocupacao;
    public NossoVetor (int capacidadeInicial) {
        v = new int[capacidadeInicial];
        capacidade = capacidadeInicial;
        ocupacao = 0;
    }
    // public NossoVetor () {
    //     v = new int[10];
    //     capacidade = 10;
    //     ocupacao = 0;
    // }
    public NossoVetor() {
        this(10);
    }
    public boolean estaCheio1 () {
        if (capacidade == ocupacao) return true;
        else return false;
    }
    public boolean estaCheio2 () {
        if (capacidade == ocupacao) return true;
        return false;
    }
    public boolean estaCheio3 () {
        return capacidade == ocupacao;
    }
    public boolean estaCheio4 () {
        return capacidade == ocupacao ? true : false;
    }
    // public boolean adiciona (int e) {
    //     if (estaCheio3()) return false;
    //     v[ocupacao++] = e;
    //     //ocupacao++;
    //     return true;
    // }
    // private void dobra () {
    //     int[] temp = new int[capacidade * 2];
    //     for (int i=0; i<ocupacao; i++) {
    //         temp[i] = v[i];
    //     }
    //     v = temp;
    //     capacidade = capacidade * 2;
    // }
    // private void reduzMetade (){
    //     int[] temp = new int[capacidade/2];
    //     for (int = 0; i<ocupacao; i++)
    //         temp[i] = v[i];
    //     v = temp;
    //     capacidade = capacidade / 2;
    // }
    private void redimensiona (int novaCapacidade){
        int[] temp = new int[novaCapacidade];
        for(int i =0; i<ocupacao; i++)
            temp[i] = v[i];
        v = temp;
        capacidade = novaCapacidade;
    }
    public void adiciona (int e) {
        if (estaCheio3()) redimensiona(capacidade * 2);
        v[ocupacao++] = e;
    }
    public boolean estaVazio () {
        return ocupacao == 0;
    }
    public int remove () {
        if (estaVazio()) return -1;
        // ocupacao--;
        int aux = v[--ocupacao];
        if (capacidade >= 10 && ocupacao <= capacidade / 4)
            redimensiona(capacidade / 2);
        return aux;
    }

    @Override
    public String toString() {
        if (estaVazio()) return "vetor vazio com capacidade" + capacidade + "\n";
        String s = "capacidade = " + capacidade + ", ocupacao = " + ocupacao + "\n";
        for (int i=0; i < ocupacao; i++) 
            s = s + v[i] + " ";
        return s + "\n";      
    }
    public void preencheVetor (){
        Random random = new Random();
        for (int i=0; i <capacidade; i++)
            v[i] = random.nextInt(10 * capacidade);
        ocupacao = capacidade;
    }
    public boolean buscaLinear (int x){
        for (int i =0; i<ocupacao; i++) {
            if (v[i] == x){  
                return true;
            }
         }
        return false;
    }
    public void bubble (){
        for (int i = 1; i <capacidade; i++){
            for (int j = 0; j < capacidade - i; j++){
                if(v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    private int partition (int p, int r) {
        int x = v[r];
        int i = p-1;
        for (int j = p; j < r; j++) {
            if (v[j] <= x) {
                i++;
                int aux = v[j];
                v[j] = v[i];
                v[i] = aux;
            }
        }
        i++;
        v[r] = v[i];
        v[i] = x;
        return i;
    }
    private void quick (int p, int r) {
        // System.out.print("p = " + p + ", r = " + r);
        if (p < r) {
            int q = partition(p, r);
            // System.out.println(", q = " + q);
            quick(p, q-1);
            quick(q+1, r);
        }
        // System.out.println();
    }
    public void quicksort() {
        quick (0, capacidade-1);
    }
    public void insertion () {
        for ( int i =1; i < capacidade; i++) {
            int x = v[i];
            int j=i-1;
            while (j >= 0 && v[j] > x) {
                v[j+1] = v[j];
                j--;
            }
            v[j+1] = x;
        }
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       