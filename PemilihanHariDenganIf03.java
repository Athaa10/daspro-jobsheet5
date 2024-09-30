import java.util.Scanner;
public class PemilihanHariDenganIf03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number, numberType;

        System.out.print("Input number: ");
        int angka = sc.nextInt();

        if (angka >=1 && angka <=5 ) {
            system.out.print("Weekday");
        }
        else if (angka >=6 && angka <=7) {
            system.out.print("Weekend");
        }
        else{
            system.out.print("Invalid");
        }

    }
}