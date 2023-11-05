package fc.java.part2;

public class MaxMinValue {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //min value
        int min = (a<b) ? a : b;
        System.out.println("min = " + min);

        //max value
        int max = (a>b) ? a : b;
        System.out.println("max = " + max);
    }
}
