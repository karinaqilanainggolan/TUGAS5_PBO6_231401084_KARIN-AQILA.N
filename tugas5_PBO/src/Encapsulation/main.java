package encapsulation;

public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan(40); // kapasitas tanki 40 liter

        kendaraan.setBahanBakar(10);
        System.out.println("Bahan bakar awal: " + kendaraan.getBahanBakar() + " liter");

        kendaraan.isiBensin(20); // isi 20 liter
        kendaraan.isiBensin(15); // coba isi lagi (akan melebihi kapasitas)
    }
}
