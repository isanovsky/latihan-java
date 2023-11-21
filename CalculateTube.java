package Latihan;


/*  Algorithm and Programming Practicum 1
    Program to calculate Are and Volume of Tube
    Ichsan Ali Darmawan
    5002231083
*/

import java.util.Scanner;

public class CalculateTube {
    public static void main(String[] args) {
        System.out.println("===============================================================");
        System.out.println("====Program to Calculate Area and Volume and Radius of Tube====");

        Scanner input = new Scanner(System.in);

        //Meminta user untuk menginputkan nilai jari-jari dan tinggi tabung
        System.out.println();
        System.out.print("| Input Height of Tube (In Meter)\t: ");
        double t = input.nextDouble();
        System.out.print("| Input Diameter of Tube (In Meter)\t: ");
        double d = input.nextDouble();
        System.out.print("| Input Volume of Tube \t\t\t: ");
        double volume1 = input.nextDouble();

        //Formula untuk menghitung jari-jari
        double r = d / 2;

        //Formula untuk menghitung luas permukaan
        double area;
        area = 2 * Math.PI * r * (r + t);
        
        //Formula untuk menghitung volume
        double volume;
        volume = (Math.PI * r * r) * t;

        //Formula untuk menghitung jari-jari jika diketahui volume dan tinggi nya
        double radius;
        radius = Math.sqrt(volume1 / (Math.PI * t));
        
        //Menampilkan hasil dari perhitungan dengan pembulatan ke satuan terdekat
        System.out.printf("\n| Area of Tube is \t: | %-20s |" , Math.round(area));
        System.out.printf("\n| Volume of Tube is \t: | %-20s |" , Math.round(volume));
        System.out.printf("\n| Radius of Tube is \t: | %-20s |" , Math.round(radius));

        input.close();
    }
}
