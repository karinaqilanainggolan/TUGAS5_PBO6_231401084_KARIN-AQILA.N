package polymorphism;

public class Motor extends Kendaraan {
    public Motor(double kapasitasTanki) {
        super(kapasitasTanki);
    }

    @Override
    public void isiBensin(double liter) {
        System.out.println("Motor: Mengisi bensin...");
        super.isiBensin(liter);
    }
}
