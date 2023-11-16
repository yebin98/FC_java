package fc.java.part5.model;

public class MinMaxFinder {
    private MinMaxFinder(){} //명시적으로 private로 생성자 만들기 -> 객체 인위적으로 생성 못하게 함
    public static int findMin(int[] arr) {
        int min = arr[0]; // 첫번쨰 배열로 초기값 지정
        for (int i = 1; i < arr.length; i++) {//int i = 1 -> 초기값이 첫번쨰 배열이므로 두번쨰 배열부터 시작
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];// 첫번쨰 배열로 초기값 지정
        for (int i = 1; i < arr.length; i++) {//int i = 1 -> 초기값이 첫번쨰 배열이므로 두번쨰 배열부터 시작
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
