package polymorphism;

public class Truk extends Kendaraan {
    public Truk(double kapasitasTanki) {
        super(kapasitasTanki);
    }

    @Override
    public void isiBensin(double liter) {
        System.out.println("Truk: Mengisi solar...");
        super.isiBensin(liter);
    }
}
