package Latihan;

public class TestBreak {

    public static int sum(int i1, int i2){
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println("SUM value from 1 to 10 is " + sum(1, 10));
        System.out.println("SUM value from 20 to 30 is " + sum(20, 30));

    }
}

