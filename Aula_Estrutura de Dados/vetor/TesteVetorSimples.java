import java.util.Scanner;
public class TesteVetorSimples {
    public static void main (String[] args) {
        int[] v;
        int tamanho, posicaoLivre, opcao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        tamanho = scanner.nextInt();
        v = new int[tamanho];
        posicaoLivre = 0;
        do {
            System.out.println("\nDigite\n1 para inserir\n2 para remover\n0 para sair\n-->");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    if (posicaoLivre < tamanho) {
                        System.out.println("\nDigite o novo elemento:");
                        int novo = scanner.nextInt();
                        v[posicaoLivre++] = novo;
                    }
                    else {
                        System.out.println("\nvetor cheio!");
                    }
                    for (int i=0; i<posicaoLivre; i++) {
                        System.out.print(v[i] + " ");
                    }
                    break;
                case 2: 
                    if (posicaoLivre > 0) {
                        System.out.println(v[--posicaoLivre] + " foi removido");
                    }
                    else {
                        System.out.println("\nvetor vazio");
                    }
                    for (int i=0; i<posicaoLivre; i++) {
                        System.out.print(v[i] + " ");
                    }
                    break;
                default:
                    System.out.println("\nVeja seu vetor, antes de ir embora");
                    for (int i=0; i<posicaoLivre; i++) {
                        System.out.print(v[i] + " ");
                    }
                    System.out.println("\nObrigado, volte sempre");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}
