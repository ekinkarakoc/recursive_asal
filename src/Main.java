import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi))
            System.out.println(sayi + " asal bir sayıdır.");
        else
            System.out.println(sayi + " asal bir sayı değildir.");
    }

    public static boolean isAsal(int sayi) {
        if (sayi <= 1)
            return false;
        else
            return isAsalRecursive(sayi, sayi - 1);
    }

    public static boolean isAsalRecursive(int sayi, int bolen) {
        if (bolen == 1)
            return true;
        else if (sayi % bolen == 0)
            return false;
        else
            return isAsalRecursive(sayi, bolen - 1);
    }
}
