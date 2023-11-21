package Latihan;
import java.util.Scanner;

public class Testing {
    public static double calculatePhiApproximation(int n) {
        double phiApproximation = 0.0;
        for (int i = 0; i < n; i++) {
            int denominator = 2 * i + 1;
            if (i % 2 == 0) {
                phiApproximation += 4.0 / denominator;
            } else {
                phiApproximation -= 4.0 / denominator;
            }
        }
        return phiApproximation;
    }
    
    public static void main(String[] args) {
        int n = 10000; // nilai n sesuai keinginan
        double phi = calculatePhiApproximation(n);
        System.out.println("Nilai pendekatan phi dengan " + n + " suku adalah: " + phi);
   
     /*    Scanner input = new Scanner(System.in);

        System.out.println("================================");
        //Meminta user menginputkan nilai volume
        System.out.print("\nMasukkan Volume Tabung \t\t\t: ");
        double volume = input.nextDouble();

        //Formula untuk menghitung height dari persamaan
        double height = Math.cbrt(4 * volume / (Math.PI * Math.pow(4, 2)));
        double radius = 4 * height / 2;

        //Menampilkan nilai yang sudah dihitung
        System.out.println("Jari-Jari Tabung Tersebut Adalah \t: " + radius);
        input.close();
        */
/* 
        for (int  i = 1; i <= 5; i++ ){
          for ( int j = 1; j <= 3; j++ ){
            for ( int k = 1; k <= 4; k++ )  
             System.out.print( '*' );
             System.out.println();
            }
            System.out.println();
        }
    */


    }
}