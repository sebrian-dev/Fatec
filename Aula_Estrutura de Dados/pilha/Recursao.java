package pilha;

public class Recursao {
    static int fatorial (int n) {
        if (n<=1) return 1;
        return n * fatorial(n-1);
    }
    // static int fib(int n) {
    //     if (n <= 1) return 1;
    //     return fib(n-1) + fib(n-2);
    // }
    static int soma_rec (int i, int n) {
        if (i == n) return i;
        return i + soma_rec(i+1, n);
    }
    static int soma_rec_inv (int n) {
        if (n==1) return 1;
        return n + soma_rec_inv(n-1);
    }
    static int soma_vet_rec (int[] v, int i) {
        if (i == v.length) return 0;
        return v[i] + soma_vet_rec(v, i+1);
    }
    public static void main(String[] args) {
        System.out.printf("fatorial de 5 = %d\n", fatorial(5));
        // for (int i = 0; i<= 30; i++) {
        //     System.out.println("fibonacci em " + i + " = " + fib(i));
        // }
        System.out.println("Soma até 5: " + soma_rec(1, 5));
        System.out.println("Soma até 5 invertida: " + soma_rec_inv(5));
        int [] v = {1,2,3,4,5};
        System.out.println("Soma do vetor: " + soma_vet_rec(v, 0));
    }
}
