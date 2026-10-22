import java.util.Scanner;
public class Tiket10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml;
        double hargaTiket = 50000;
        double totalHarga;
        double diskon;
        int penjualan = 0;
        double totalPenjualan = 0;
        String pelanggan;
        int i = 0;

        do { 
            System.out.print("Apakah ada pelanggan?(ketik 'tidak' jika tidak ada): ");
            pelanggan = sc.nextLine();
            
            if (pelanggan.equalsIgnoreCase("tidak")) {
                System.out.println("Pelanggan tidak ada");
                break;
            }
            
            System.out.print("Berapa jumlah tiket yang dibeli?: ");
            jml = sc.nextInt();
            sc.nextLine();
                if (jml <= 0) {
                    System.out.println("Jumlah tiket tidak valid");
                    continue;
                }
                if (jml > 0 && jml <= 4) {
                    diskon = 0;
                } else if (jml > 4 && jml <= 10)  {
                    diskon = 0.1;
                } else {
                    diskon = 0.15;
                }

                totalHarga = jml * hargaTiket;
                totalHarga = totalHarga - (totalHarga * diskon);
                System.out.println("Total harga tiket: " + totalHarga);

            i++;
            penjualan += jml;
            totalPenjualan += totalHarga;
        } while (true);
        System.out.println("Program selesai.");
        System.out.println("Total tiket yang terjual hari ini: " + penjualan);
        System.out.println("Total harga tiket yang didapatkan hari ini: " + totalPenjualan);
    }
}
