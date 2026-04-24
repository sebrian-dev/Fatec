public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        System.out.println(v);
        int i = 10;
        while (!v.estaCheio3()) {
            v.adiciona(i);
            i += 10;
        }
        System.out.println(v);
        System.out.println(v.remove() + " foi removido");
        System.out.println(v);
    }
}
