import java.util.Scanner;

public class KuisKantin9hafis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porsi;
        int total = 0;
        int jumlahTransaksi = 0;
        int nim2  = 78;
        int k = (nim2 % 3) + 3;

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();
        jumlahTransaksi++;
    
       while (porsi < 1 || porsi > 10) {
          System.out.println("Input tidak valid");
          System.out.print("Jumlah porsi (0 = selesai): ");
          porsi = sc.nextInt();  
}


        while (porsi != 0) {
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi
            int biaya = 15000 + (porsi - 1) * 12000;
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);

            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();

            if (nim2 % 3 == 0) {
                total -= biaya * 0.5;
            }

           
            jumlahTransaksi++;

        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("diskon 50%: biaya: Rp " + (total * 0.5));
        System.out.println("total diskon: Rp " + (total - (total * 0.5)));
    }
}