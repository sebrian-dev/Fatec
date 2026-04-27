public class TesteLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        
        try{
          int i = lista.removeInicio();  
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(lista);
        lista.insereInicio(10);
        System.out.println(lista);
        lista.insereInicio(20);
        System.out.println(lista);
        lista.insereInicio(30);
        System.out.println(lista);

        try {
            System.out.println(lista.removeInicio() + "Saiu");
            System.out.println(lista);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        lista.insereFim(15);
        System.out.println(lista);
        lista.insereFim(25);
        System.out.println(lista);

        try {
            System.out.println(lista.removeFim() + "Saiu");
            System.out.println(lista);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
