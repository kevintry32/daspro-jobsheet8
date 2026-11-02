import java.util.Scanner;

public class NilaiKelompok12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kelompok: ");
        int jumlahKelompok = sc.nextInt();

        System.out.print("Masukkan jumlah penilai: ");
        int jumlahPenilai = sc.nextInt();

        double rataTertinggi = -1;
        int kelompokTerbaik = 0;

        int kelompok = 1;

        while (kelompok <= jumlahKelompok) {
            double totalNilai = 0;

            System.out.println("\nKelompok ke-" + kelompok);

            for (int penilai = 1; penilai <= jumlahPenilai; penilai++) {
                double nilai;

                do {
                    System.out.print("Masukkan nilai penilai ke-" 
                            + penilai + " (0-100): ");
                    nilai = sc.nextDouble();

                    if (nilai < 0 || nilai > 100) {
                        System.out.println(
                                "Nilai tidak valid. Masukkan kembali!");
                    }

                } while (nilai < 0 || nilai > 100);

                totalNilai += nilai;
            }

            double rataRata = totalNilai / jumlahPenilai;

            System.out.println("Total nilai kelompok: " + totalNilai);
            System.out.println("Rata-rata kelompok: " + rataRata);

            if (rataRata > rataTertinggi) {
                rataTertinggi = rataRata;
                kelompokTerbaik = kelompok;
            }

            kelompok++;
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi: "
                + kelompokTerbaik);
        System.out.println("Rata-rata tertinggi: " + rataTertinggi);

        sc.close();
    }
}