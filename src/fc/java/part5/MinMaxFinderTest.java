package fc.java.part5;

import fc.java.part5.model.MinMaxFinder;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7};
        int min = MinMaxFinder.findMin(arr); //메소드 이름이 기울어진 이유 : static이므로
        int max = MinMaxFinder.findMax(arr);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
