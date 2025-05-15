package polymorphism;

public class main {
    public static void main(String[] args) {
        Kendaraan[] kendaraanList = {
                new Mobil(50),
                new Motor(15),
                new Truk(200)
        };

        for (Kendaraan k : kendaraanList) {
            k.isiBensin(20);
            System.out.println();
        }
    }
}
