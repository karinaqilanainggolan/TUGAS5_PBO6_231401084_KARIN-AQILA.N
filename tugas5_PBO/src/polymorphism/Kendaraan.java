package polymorphism;

public class Kendaraan {
    protected double bahanBakar;
    protected double kapasitasTanki;

    public Kendaraan(double kapasitasTanki) {
        this.kapasitasTanki = kapasitasTanki;
        this.bahanBakar = 0;
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
