import java.util.Scanner;

public class TesteBuscaOrdenacaco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NossoVetor v;

        System.out.print("Escolha o tamanho do vetor (0 encerra): ");
        int capacidade = scanner.nextInt();

        while(capacidade > 0) {
            v = new NossoVetor(capacidade);
            v.preencheVetor();
            // System.out.println(v);
            // System.out.print("Digite um valor para busca: ");
            // int x = scanner.nextInt();

            // if (v.buscaLinear(x)){
            //     System.out.println(x + "foi encontrado no Vetor");
            // }
            // else{
            //     System.out.println(x + "não foi encontrado no Vetor");
            // }
            System.out.println("Ordenando...");
            v.bubble();
            System.out.println("\nVetor odenado:");
            // System.out.println(v);

            System.out.print("Escolha o novo tamanho do vetor (0 encerrar): ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
