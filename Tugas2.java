import java.util.Scanner; // ambil data dari library untuk Scanner
import java.text.DecimalFormat; // untuk mengganti format angka

public class Tugas2 {
    public static void main(String[] args) {
        // untuk membuat input ketika program berjalan
        // Karena Java tidak memiliki syntax input seperti py atau JS
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###");


        while (true) {
            // input golongan
            System.out.println("Masukkan kategori golongan! : (A/B/C)");
            String golongan = input.nextLine();

            if (!golongan.equals("A") && !golongan.equals("B") && !golongan.equals("C")) {
                System.out.println("Golongan yang anda masukkan tidak valid! Silakan masukkan lagi");
                continue;
            }

            // input jam lembur
            System.out.println("Masukkan jam lembur! : (1/2/3/4/5)");
            int jam = input.nextInt();

            int gajiPokok = 0;
            double gajiLembur = 0;

            // menentukan gaji pokok
            if (golongan.equals("A")) {
                gajiPokok = 5000000;
            } else if (golongan.equals("B")) {
                gajiPokok = 6500000;
            } else if (golongan.equals("C")) {
                gajiPokok = 9500000;
            } 
            
            // menentukan jam lembur
            if (jam == 1) {
                gajiLembur = gajiPokok * .30;
            } else if (jam == 2) {
                gajiLembur = gajiPokok * .32;
            } else if (jam == 3) {
                gajiLembur = gajiPokok * .34;
            } else if (jam == 4) {
                gajiLembur = gajiPokok * .36;
            } else if (jam >= 5) {
                gajiLembur = gajiPokok * .38;
            } else {
                gajiLembur = 0;
            }

            // menunjukkan total gaji
            double total = gajiPokok + gajiLembur;

            // output
            System.out.println("Jumlah pengjasilannya Rp." + df.format(total));
            return;
        }
    }


}