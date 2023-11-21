package Latihan;
import java.util.Scanner;

public class CalculateRadiusTube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        //Meminta user menginputkan nilai volume
        System.out.print("\nMasukkan Volume Tabung \t\t\t: ");
        double volume = input.nextDouble();

        //Formula untuk menghitung height dari persamaan
        double height = Math.cbrt(25 * volume / (Math.PI * Math.pow(2023, 2)));
        double radius = 2023 * height / 5;

        //Menampilkan nilai yang sudah dihitung
        System.out.println("Jari-Jari Tabung Tersebut Adalah \t: " + radius);
        input.close();
    }
}
