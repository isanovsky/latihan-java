package Latihan;
import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga Pascal: ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

