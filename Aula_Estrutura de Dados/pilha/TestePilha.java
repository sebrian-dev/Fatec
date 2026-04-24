package pilha;

public class TestePilha {
    public static void main(String[] args) {
        //Pilha p = new Pilha(); houve sobrescrita de construtor
        Pilha p = new Pilha(10);
        p.empilha(1);
        p.empilha(2);
        p.empilha(3);
        System.out.println(p);
        System.out.println(p.desempilha() + " foi desempilhado");
        System.out.println(p);
    }
}
