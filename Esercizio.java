import java.util.Scanner;
import java.util.Random;

class Program {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, coppie, j, cornici;
        boolean trovato;

        System.out.println("Dimensione vettore");
        n = input.nextInt();
        int[] v = new int[n];

        for (i = 0; i <= n - 1; i++) {
            v[i] = random.nextInt(7) + 4;
            System.out.println(v[i]);
        }
        coppie = 0;
        trovato = false;
        while (n >= 2 && trovato == false) {
            trovato = false;
            for (i = 0; i <= n - 2; i++) {
                for (j = i + 1; j <= n - 1; j++) {
                    if (v[i] == v[j]) {
                        n = elimina(v, n, j);
                        n = elimina(v, n, i);
                        coppie = coppie + 1;
                        trovato = true;
                    }
                }
            }
            trovato = !trovato;
        }
        cornici = (int) ((double) coppie / 2);
        System.out.println("cornici = " + cornici);
    }
    
    public static int elimina(int[] v, int n, int posizione) {
        int i, n2;

        for (i = posizione; i <= n - 2; i++) {
            v[i] = v[i + 1];
        }
        n2 = n - 1;
        
        return n2;
    }
}
