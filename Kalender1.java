package Latihan;
import java.util.Calendar;
import java.util.Scanner;


public class Kalender1 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
        
                System.out.print("Masukkan tanggal (1-31): ");
                int tanggal = input.nextInt();
        
                System.out.print("Masukkan bulan (1-12): ");
                int bulan = input.nextInt();
        
                System.out.print("Masukkan tahun (e.g. 1990): ");
                int tahun = input.nextInt();
        
                // Daftar nama hari dalam bahasa Indonesia
                String[] namaHariIndonesia = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};
        
                Calendar calendar = Calendar.getInstance();
                calendar.set(tahun, bulan - 1, tanggal);
        
                int indeksHariIndonesia = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        
                // Daftar nama hari pasaran dalam bahasa Jawa
                String[] namaHariJawa = {"Legi", "Pahing", "Pon", "Wage", "Kliwon"};

        
                // Menghitung indeks berdasarkan indeks hari pasaran dalam bahasa Jawa
                int indeksHariJawa = (indeksHariIndonesia - 1) % namaHariJawa.length;
  
                // Menampilkan hari kelahiran dalam format yang diinginkan
                String namaHariPasaranJawa = namaHariJawa[indeksHariJawa];
                String namaHariIndo = namaHariIndonesia[indeksHariIndonesia];
        
                System.out.println("Anda lahir pada hari " + namaHariIndo + " " + namaHariPasaranJawa);
        
                input.close();
            }
        }


