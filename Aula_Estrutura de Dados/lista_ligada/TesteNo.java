public class TesteNo {
    public static void main(String[] args) {
        No no1 = new No(10);
        No no2 = new No(20);

        no1.setProximo(no2);
        no2.setProximo(no1);
        System.out.println(no1);
        //System.out.println(no1.getProximo());
    }
}
