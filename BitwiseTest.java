package Latihan;
import java.util.Scanner;

public class BitwiseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input value of x : ");
        int x = input.nextInt();

        if ((x > 1) & (x++ < 10)) {
            System.out.println("X Value is " + x);
        } 
       else  if ((x > 1) && (x++ < 10)) {
            System.out.println("X Value is " + x);        
        } 
        if ((1 == x) | (10 > x++)) {
            System.out.println("X Value is " + x);
        } 
        if ((1 == x) || (10 > x++)) {
            System.out.println("X Value is " + x);
        }
        input.close();
    }
}
