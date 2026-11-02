import java.util.Scanner;

public class Tugas03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
            sc.close();
            return;
        }

        int totalSemuaBarang = 0;
        int tokoTerbanyak = 0;
        int barangTerbanyak = -1;

        int totalSemuaPelanggan = 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            System.out.println("\nToko ke-" + toko);

            System.out.print("Masukkan jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();

            int totalBarangToko = 0;

            for (int pelanggan = 1;
                    pelanggan <= jumlahPelanggan;
                    pelanggan++) {

                System.out.print("Jumlah barang pelanggan ke-"
                        + pelanggan + ": ");

                int jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0) {
                    System.out.println(
                            "Jumlah barang tidak boleh negatif.");

                    System.out.print("Masukkan kembali jumlah barang: ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            totalSemuaPelanggan += jumlahPelanggan;
            totalSemuaBarang += totalBarangToko;

            System.out.println("Total pelanggan toko: "
                    + jumlahPelanggan);

            System.out.println("Total barang toko: "
                    + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("\n===== REKAP PENJUALAN =====");

        System.out.println("Total seluruh pelanggan: "
                + totalSemuaPelanggan);

        System.out.println("Total seluruh barang: "
                + totalSemuaBarang);

        System.out.println("Toko dengan penjualan barang terbanyak: "
                + tokoTerbanyak);

        System.out.println("Jumlah barang terbanyak: "
                + barangTerbanyak);

        sc.close();
    }
}