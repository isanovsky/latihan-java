/*
TUGAS KELOMPOK ALGORITMA DAN PEMROGRAMAN
Nama Kelompok :                     NRP :
1. Ananta Pramudya Wardani          5002231158
2. Gholam Naswar Samsu              5002231043
3. Ichsan Ali Darmawan              5002231083              
4. Rindu Kasih Putih Surya Hamim    5002231160

 */

package Latihan;
import java.util.Scanner;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class KalenderJawa {
    static Scanner input = new Scanner(System.in);

    static String[] namaHari = {"Minggu", 
                                "Senin", 
                                "Selasa", 
                                "Rabu", 
                                "Kamis", 
                                "Jumat", 
                                "Sabtu"};

    static String[] namaPasaran = {"Pahing",
                                  "Pon", 
                                  "Wage",
                                  "Kliwon", 
                                  "Legi"};

    static String[] namaBulan = {"Januari", 
                                "Februari", 
                                "Maret", 
                                "April", 
                                "Mei", 
                                "Juni", 
                                "Juli", 
                                "Agustus", 
                                "September",
                                "Oktober", 
                                "Nopember", 
                                "Desember"};

    public static int[] MenuUtama(){
            System.out.println("|============================*****===========================|");
            System.out.println("|-------------- PROGRAM TO CALCULATE DAY & WETON ------------|");
            System.out.println("|============================================================|");
            //meminta pengguna memasukan tanggal/bulan/tahun lahir
            System.out.print("\nMasukkan tanggal lahir anda (1-31)\t: ");
            int tanggal = input.nextInt();
    
            System.out.print("Masukkan bulan lahir anda (1-12)\t: ");
            int bulan = input.nextInt();
    
            System.out.print("Masukkan tahun lahir anda (e.g. 1990)\t: ");
            int tahun = input.nextInt();
            System.out.println();

            int[] data1 = {tanggal, bulan, tahun};
            return data1;
        
    }

    public static int[] Tebakan(){
            // Menampilkan tebakan hari lahir
            System.out.println("| Daftar Nama Hari |");
            for (int i = 0; i < namaHari.length; i++) {
                System.out.printf( "| %-2s | %-11s |" , i + 1 ,  namaHari[i]);
                System.out.println();
            }
            System.out.print("| Silahkan tebak hari lahir Anda (select 1-7) : ");
            int select1 = input.nextInt();
            System.out.println();

            // Menampilkan tebakan weton
            System.out.println("| Daftar Nama Weton |");
            for (int i = 0; i < namaPasaran.length; i++) {
                 System.out.printf( "| %-2s | %-12s |" , i + 1 ,  namaPasaran[i]);
                 System.out.println();
            }
            System.out.print("| Silahkan tebak weton Anda (select 1-5) : ");
            int select2 = input.nextInt();

            int[] data2 = {select1, select2};
            return data2;
    }
    public static void main(String[] args) {
            int[] data1 = MenuUtama();
            int tanggal = data1[0];
            int bulan = data1[1];
            int tahun = data1[2];

            int[] data2 = Tebakan();
            int select1 = data2[0];
            int select2 = data2[1];
           
            // Membuat objek Calendar
            Calendar calendar = Calendar.getInstance();
            calendar.set(tahun, bulan - 1, tanggal); // bulan dimulai dari 0 (Januari)
            
            // Menghitung Weton 
            LocalDate date = LocalDate.of(tahun, bulan, tanggal);
            LocalDate start = LocalDate.of(1900, 1, 1);
            long daysBetween = ChronoUnit.DAYS.between(start, date);

            // Mendapatkan indeks hari dan indeks bulan
            int indeksHari = calendar.get(Calendar.DAY_OF_WEEK);
            int indeksHariJawa = (int) (daysBetween % namaPasaran.length);
            int indeksBulan = calendar.get(Calendar.MONTH);

            // Menampilan hari dalam format yang diinginkan
            String namaHariIndo = namaHari[indeksHari - 1];
            String namaHariPasaranJawa = namaPasaran[indeksHariJawa];
            String namaBulanIndo = namaBulan[indeksBulan];
    
            // Perulangan tebakan
            while (select1 != indeksHari || (select2 - 1) != indeksHariJawa) {
                System.out.println("\n|Sayang sekali anda belum menebak hari lahir anda dengan benar|");
                String choice;
                System.out.print("|Apakah anda ingin mencoba lagi ? <Y/N> : ");
                choice = input.next();
                if ((choice.charAt(0) == 'Y') || choice.charAt(0) == 'y') {
                    Tebakan();
                } else {
                    break;  
                } 
            }
            if (select1 == indeksHari && (select2 - 1) == indeksHariJawa) {
                System.out.println("\n|** Selamat Anda Berhasil Menebak Hari Lahir dan Weton Anda **|");
            } 
            
            // Menampilkan hari kelahiran dan weton
            System.out.println("\n|------------------------------------------------------------|");
            System.out.println("|Anda lahir pada hari " + namaHariIndo + " " + namaHariPasaranJawa + " ditanggal " + 
            tanggal + " " + namaBulanIndo + " " + tahun + "|");
            System.out.println("|------------------------------------------------------------|");
    
            input.close();
        }
    }
    
