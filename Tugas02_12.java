import java.util.Scanner;

public class Tugas02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran tabel (minimal 3): ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Ukuran tabel minimal 3.");
        } else {
            int total = 0;

            System.out.println("\nTabel Perkalian:");

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int hasil = i * j;

                    System.out.printf("%4d", hasil);

                    total += hasil;
                }

                System.out.println();
            }

            System.out.println("\nJumlah seluruh hasil perkalian: "
                    + total);
        }

        sc.close();
    }
}