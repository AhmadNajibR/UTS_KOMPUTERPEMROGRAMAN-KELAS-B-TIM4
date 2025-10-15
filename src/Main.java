import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotel = new Hotel();
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        // Tambahkan beberapa kamar
        hotel.tambahKamar(new Kamar(101, "Standard", 300000));
        hotel.tambahKamar(new Kamar(102, "Deluxe", 450000));
        hotel.tambahKamar(new Kamar(103, "Suite", 700000));
        hotel.tambahKamar(new Kamar(104, "Standard", 300000));
        hotel.tambahKamar(new Kamar(105, "Deluxe", 450000));

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PEMESANAN KAMAR HOTEL ===");
            System.out.println("1. Tampilkan semua kamar");
            System.out.println("2. Pesan kamar");
            System.out.println("3. Tampilkan kamar kosong");
            System.out.println("4. Tampilkan kamar dipesan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:
                    hotel.tampilkanSemuaKamar();
                    break;

                case 2:
                    System.out.print("Masukkan nama tamu: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan durasi menginap (malam): ");
                    int durasi = input.nextInt();

                    System.out.println("\nPilih tipe kamar:");
                    System.out.println("1. Standard (Rp300.000/malam)");
                    System.out.println("2. Deluxe (Rp450.000/malam)");
                    System.out.println("3. Suite (Rp700.000/malam)");
                    System.out.print("Masukkan pilihan (1-3): ");
                    int tipePilihan = input.nextInt();
                    input.nextLine(); // buffer

                    String tipeKamar = "";
                    switch (tipePilihan) {
                        case 1:
                            tipeKamar = "Standard";
                            break;
                        case 2:
                            tipeKamar = "Deluxe";
                            break;
                        case 3:
                            tipeKamar = "Suite";
                            break;
                        default:
                            System.out.println("Pilihan tidak valid!");
                            continue; // kembali ke menu utama
                    }

                    Kamar kamarDipilih = hotel.cariKamarKosong(tipeKamar);

                    if (kamarDipilih != null) {
                        Tamu tamu = new Tamu(nama, durasi);
                        kamarDipilih.pesanKamar();
                        double total = hotel.hitungTotalBayar(tamu, kamarDipilih);

                        System.out.println("\nPEMESANAN BERHASIL!");
                        System.out.println("-------------------------------");
                        System.out.println("Nama Tamu   : " + tamu.getNama());
                        System.out.println("Tipe Kamar  : " + kamarDipilih.getTipeKamar());
                        System.out.println("Nomor Kamar : " + kamarDipilih.getNomorKamar());
                        System.out.println("Harga / Malam : " + nf.format(kamarDipilih.getHargaPerMalam()));
                        System.out.println("Durasi Menginap : " + durasi + " malam");
                        System.out.println("-------------------------------");
                        System.out.println("Total Bayar : " + nf.format(total));
                    } else {
                        System.out.println("\u001B[31;1mMaaf, kamar tipe " + tipeKamar + " sudah penuh!\u001B[0m");
                        System.out.println("\u001B[31;1mSilakan pilih tipe kamar lain!!!\u001B[0m");                        
                    }
                    break;

                case 3:
                    hotel.tampilkanKamarKosong();
                    break;

                case 4:
                    hotel.tampilkanKamarDipesan();
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }
}
