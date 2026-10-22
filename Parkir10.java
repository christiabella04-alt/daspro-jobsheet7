import java.util.Scanner;
public class Parkir10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int motor = 2000;
        int mobil = 3000;
        int jam;
        int tarif;
        int totalPendapatan = 0;

        do {
            System.out.print("Jumlah kendaraan (0 untuk selesai): ");
            int jml = sc.nextInt();
            sc.nextLine();

            if (jml == 0) {
                System.out.println("Program selesai");
                break;
            }

            if (jml < 0) {
                System.out.println("Jumlah kendaraan tidak valid.");
                continue;
            }

            for (int i = 1; i <= jml; i++) {
                System.out.println("\nKendaraan ke-" + i);
                System.out.print("Jenis kendaraan (mobil/motor): ");
                String jenis = sc.nextLine();

                if (jenis.equalsIgnoreCase("mobil")) {
                    System.out.print("Berapa jam kendaraan parkir?: ");
                    jam = sc.nextInt();
                    sc.nextLine();

                    if (jam <= 0) {
                        System.out.println("Jumlah jam tidak valid.");
                        i--;
                        continue;
                    }

                    tarif = jam * mobil;
                    System.out.println("Tarif parkir: Rp" + tarif);
                    totalPendapatan += tarif;

                } else if (jenis.equalsIgnoreCase("motor")) {
                    System.out.print("Berapa jam motor parkir?: ");
                    jam = sc.nextInt();
                    sc.nextLine();

                    if (jam <= 0) {
                        System.out.println("Jumlah jam tidak valid.");
                        i--;
                        continue;
                    }

                    tarif = jam * motor;
                    System.out.println("Tarif parkir: Rp" + tarif);
                    totalPendapatan += tarif;

                } else {
                    System.out.println(
                        "Mohon maaf, jenis kendaraan tidak terdaftar."
                    );
                    i--;
                }
            }

        } while (true);

        System.out.println("Total pendapatan parkir: Rp" + totalPendapatan);
        sc.close();
    }
}
