package Latihan;
import java.util.Random;
import java.util.Scanner;


public class Ujicoba {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String str = input.nextLine();
        
        if (isPalindrome(str)) {
            System.out.println("String adalah palindrom.");
        } else {
            System.out.println("String bukan palindrom.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Jika ada karakter yang tidak sama, bukan palindrom
            }
            left++;
            right--;
        }
        
        return true; // Semua karakter cocok, palindrom
    }

}
