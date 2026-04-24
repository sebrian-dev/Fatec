package pilha;

import java.util.Scanner;

public class TestePilhaCartas {
    public static void main(String[] args) {
        PilhaCartas monte = new PilhaCartas(6);
        Carta c1 = new Carta("2", "ouros");

        monte.empilha(c1);
        monte.empilha(new Carta("3", "paus"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da carta:");
        String numero = scanner.nextLine();

        System.out.println("Digite o naipe:");
        String naipe = scanner.nextLine();
        
        monte.empilha(new Carta(numero, naipe));
        System.out.println(monte);

        scanner.close();
    }
}
