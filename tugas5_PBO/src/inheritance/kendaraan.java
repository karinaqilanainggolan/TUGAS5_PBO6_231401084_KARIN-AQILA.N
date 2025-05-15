package inheritance;

public class Kendaraan {
    private double bahanBakar;
    private double kapasitasTanki;

    public Kendaraan(double kapasitasTanki) {
        this.kapasitasTanki = kapasitasTanki;
        this.bahanBakar = 0;
    }

    public double getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(double jumlah) {
        if (jumlah >= 0 && jumlah <= kapasitasTanki) {
            this.bahanBakar = jumlah;
        } else {
            System.out.println("Jumlah bahan bakar tidak valid.");
        }
    }

    public void isiBensin(double liter) {
        if (bahanBakar + liter <= kapasitasTanki) {
            bahanBakar += liter;
            System.out.println("Mengisi " + liter + " liter. Sekarang: " + bahanBakar + " liter.");
        } else {
            System.out.println("Gagal isi. Melebihi kapasitas tanki.");
        }
    }
}
