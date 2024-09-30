import java.util.Scanner;
public class PemilihanBilangan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka;

        String hasil;

        if (angka % 2 == 0)
        {
            hasil = "Angka " + angka + " termasuk bilangan genap";
        }
        else
        {
            hasil = "Angka " + angka + " termasuk bilangan ganjil";
        }
        System.out.println(angka + " adalah " + hasil);

    }
}