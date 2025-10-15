public class Kamar {
    private int nomorKamar;
    private String tipeKamar;
    private double hargaPerMalam;
    private boolean status; // false = kosong, true = dipesan

    public Kamar(int nomorKamar, String tipeKamar, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
        this.status = false;
    }

    public int getNomorKamar() { return nomorKamar; }
    public String getTipeKamar() { return tipeKamar; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public boolean getStatus() { return status; }

    public void pesanKamar() { status = true; }
    public void kosongkanKamar() { status = false; }

    public void tampilkanInfo() {
        System.out.println("Kamar No: " + nomorKamar + 
                           " | Tipe: " + tipeKamar + 
                           " | Harga: Rp" + hargaPerMalam + 
                           " | Status: " + (status ? "Dipesan" : "Kosong"));
    }
}
