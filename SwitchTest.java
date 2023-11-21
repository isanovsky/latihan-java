package Latihan;
import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Status : ");
        int status = input.nextInt();

        switch (status) {
            case 0: 
            System.out.println("Compute taxes for single filers");
                break;
            case 1:
            System.out.println("Compute taxes for married file jointly");
                break;
            case 2:
            System.out.println("Compute taxes for married file spearately");
                break;
            case 3:
            System.out.println("Compute taxes for head of household");
                break;            
            default:
            System.out.println("Errors: Invalid status");
                break;
        }
        input.close();
    }
}
