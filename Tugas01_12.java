import java.util.Scanner;

public class Tugas01_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Jumlah baris minimal 1.");
        } else {
            int total = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                    total++;
                }

                System.out.println();
            }

            System.out.println("Total angka yang dicetak: " + total);
        }

        sc.close();
    }
}