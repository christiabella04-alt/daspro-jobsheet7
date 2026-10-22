import java.util.Scanner;
public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi;
        int teh;
        int roti;
        String namaPelanggan;

        //tambahan
        int totalHarga;

        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;

        do { 
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.err.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.err.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
