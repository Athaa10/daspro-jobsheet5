import java.util.Scanner;
public class PemilihanHari03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayName, dayType;

        System.out.prin("Input day nama: ");
        dayName = sc.nextInt();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            default:
                dayType = "invalid day name";
        }

        System.out.println(dayName + "is a" + dayType);

    }

}