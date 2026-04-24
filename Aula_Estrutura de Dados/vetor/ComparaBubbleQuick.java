import java.util.Calendar;
import java.util.Scanner;

public class ComparaBubbleQuick {
    public static void main(String[] args) {
        NossoVetor v;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor, 0 encerra: ");
        int capacidade = scanner.nextInt();
        while (capacidade > 0) {
            v = new NossoVetor(capacidade);

            v.preencheVetor();
            // System.out.println(v);
            long ini = Calendar.getInstance().getTimeInMillis();
            v.bubble();
            long fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Bubble: capacidade = " + capacidade + "," + (fim - ini) + " ms");
            // System.out.println(v);

            v.preencheVetor();
            // System.out.println(v);
            ini = Calendar.getInstance().getTimeInMillis();
            v.quicksort();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Quick: capacidade = " + capacidade + "," + (fim - ini) + " ms");
            // System.out.println(v);
            
            // v.preencheVetor();
            // ini = Calendar.getInstance().getTimeInMillis();
            // v.quicksort();
            // fim = Calendar.getInstance().getTimeInMillis();
            // System.out.println("Quick já odernado: capacidade = " + capacidade + "," + (fim - ini) + " ms");

            v.preencheVetor();
            ini = Calendar.getInstance().getTimeInMillis();
            v.insertion();
            fim = Calendar.getInstance().getTimeInMillis();
            System.out.println("Insertion = " + capacidade + "," + (fim - ini) + " ms");

            System.out.print("Digite o tamanho do vetor, 0 encerra: ");
            capacidade = scanner.nextInt();
        }
        scanner.close();
    }
}
