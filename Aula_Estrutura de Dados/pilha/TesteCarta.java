package pilha;

public class TesteCarta {
    public static void main(String[] args) {
        Carta c1 = new Carta("as", "ouros");
        //System.out.println(c1.getNumero() + ", " + c1.getNaipe());
        System.out.println(c1);

        c1.setNumero("rainha");

        //System.out.println(c1.getNumero() + ", " + c1.getNaipe());
        System.out.println(c1);
    }
}
