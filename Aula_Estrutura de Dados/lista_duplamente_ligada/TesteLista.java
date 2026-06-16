public class TesteLista {
    public static void main(String[] args) {
        ListaDupla listaDupla = new ListaDupla();
        
        System.out.println(listaDupla);

        listaDupla.insereInicio(10);
        System.out.println(listaDupla);

        listaDupla.insereInicio(20);
        System.out.println(listaDupla);

        listaDupla.insereFim(15);
        System.out.println(listaDupla);

        System.out.println(listaDupla.removePrimeiro() + " saiu do ínicio");
        System.out.println(listaDupla);

        System.out.println(listaDupla.removeUltimo() + " saiu do final");
        System.out.println(listaDupla);
    }
}
