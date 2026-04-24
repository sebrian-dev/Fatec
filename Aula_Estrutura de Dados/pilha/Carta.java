package pilha;

public class Carta {
    private String numero;
    private String naipe;
    public Carta (String numero, String naipe) {
        this.naipe = naipe;
        this.numero = numero;
    }
    //métodos de acesso
    public String getNaipe () {
        return naipe;
    }
    public String getNumero () {
        return numero;
    }
    //métodos modificadores
    public void setNaipe (String naipe) {
        this.naipe = naipe;
    }
    public void setNumero (String numero) {
        this.numero = numero;
    }
    @Override
    public String toString () {
        return numero + ", " + naipe;
    }
}
