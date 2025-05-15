package polymorphism;

public class Mobil extends Kendaraan {
    public Mobil(double kapasitasTanki) {
        super(kapasitasTanki);
    }

    @Override
    public void isiBensin(double liter) {
        System.out.println("Mobil: Mengisi bensin...");
        super.isiBensin(liter);
    }
}
