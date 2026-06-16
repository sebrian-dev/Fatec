public class TesteHash {
    public static void main(String[] args) {
        NossoHash <Integer, String> mapa = new NossoHash<>();
        mapa.put(1234, "aaa");
        mapa.put(2345, "bbb");
        mapa.put(3456, "ccc");
        mapa.put(4567, "ddd");
        mapa.put(5678, "eee");
        mapa.put(6789, "fff");
        mapa.put(7890, "ggg");
        mapa.put(9876, "hhh");
        mapa.put(8765, "iii");
        mapa.put(7654, "jjj");
        mapa.exibeMap();
        
        String valor = mapa.get(2234);
        if (valor == null) {
            System.out.println("Chave não encontrada");
        }
        else {
            System.out.println("Valor: " + valor);
        }
        if (mapa.containsValue("ccc")) {
            System.out.println("Valor ccc encontrado");
        }
        else {
            System.out.println("ccc não encontrado");
        }
    }
}
