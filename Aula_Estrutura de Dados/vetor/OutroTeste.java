public class OutroTeste {
    public static void main(String[] args) {
        NossoVetor v = new NossoVetor(6);
        for (int i=1; i<=100; i++) {
            v.adiciona(i);
            System.out.println(v);
        }
        while (!v.estaVazio())
            System.out.println(v.remove());
        System.out.println(v);
    }
}
