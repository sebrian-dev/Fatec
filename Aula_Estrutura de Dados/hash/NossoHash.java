public class NossoHash <K, V> {
    private Entrada <K, V> [] tabela;
    private int capacidade;

    @SuppressWarnings("unchecked")
    public NossoHash () {
        tabela = new Entrada[16];
        capacidade = 16;
    }
    private int hash (K key) {
        return Math.abs(key.hashCode()) % capacidade;        
    }
    public void put (K key, V value) {
        int posicao = hash(key);
        Entrada <K, V> entrada = new Entrada <>(key, value);
        entrada.proximo = tabela[posicao];
        tabela[posicao] = entrada;
    }
    public V get (K key) {
        int posicao = hash(key);
        Entrada<K, V> atual = tabela[posicao];
        while (atual != null) {
            if (key.equals(atual.key)) return atual.value;
            atual = atual.proximo;
        }
        return null;
    }
    public boolean containsKey (K key) {
        int posicao = hash(key);
        Entrada<K, V> atual = tabela[posicao];
        while (atual != null) {
            if (key.equals(atual.key)) return true;
            atual = atual.proximo;
        }
        return false;
    }
    public void exibeMap () {
        for (int i=0; i < capacidade; i++) {
            System.out.println("Posicao " + i);
            Entrada <K, V> atual = tabela[i];
            while (atual != null) {
                System.out.println("Chave: " + atual.key + ", Valor: " + atual.value);
                atual = atual.proximo;
            }
        }
    }
    public boolean containsValue (V value) {
        for (int i=0; i < capacidade; i++) {
            System.out.println("Posicao " + i);
            Entrada <K, V> atual = tabela[i];
            while (atual != null) {
                if (value.equals(atual.value)) return true;
                atual = atual.proximo;
            }
        }
        return false;
    }
}
