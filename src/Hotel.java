import java.util.ArrayList;

public class Hotel {
    private ArrayList<Kamar> daftarKamar = new ArrayList<>();

    public void tambahKamar(Kamar k) {
        daftarKamar.add(k);
    }

    public Kamar cariKamarKosong(String tipe) {
        for (Kamar k : daftarKamar) {
            if (k.getTipeKamar().equalsIgnoreCase(tipe) && !k.getStatus()) {
                return k;
            }
        }
        return null;
    }

    public double hitungTotalBayar(Tamu t, Kamar k) {
        return t.getDurasiMenginap() * k.getHargaPerMalam();
    }

    public void tampilkanSemuaKamar() {
        for (Kamar k : daftarKamar) {
            k.tampilkanInfo();
        }
    }

    public void tampilkanKamarKosong() {
        System.out.println("\n=== Daftar Kamar Kosong ===");
        for (Kamar k : daftarKamar) {
            if (!k.getStatus()) {
                k.tampilkanInfo();
            }
        }
    }

    public void tampilkanKamarDipesan() {
        System.out.println("\n=== Daftar Kamar Dipesan ===");
        for (Kamar k : daftarKamar) {
            if (k.getStatus()) {
                k.tampilkanInfo();
            }
        }
    }
}
