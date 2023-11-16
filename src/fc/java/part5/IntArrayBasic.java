package fc.java.part5;

public class IntArrayBasic {
    public static void main(String[] args) {
        int[] nums = new int[5]; // 5개의 정수를 저장하는 배열 선언 => 고정길이(단점) -> 가변길이? : 배열생성동작 - method
        nums[0] = 1; // 첫 번째 요소에 1 저장 => 저장하는 동작(입력, 추가) - method
        nums[1] = 2; // 두 번째 요소에 2 저장
        nums[2] = 3; // 세 번째 요소에 3 저장
        nums[3] = 4; // 네 번째 요소에 4 저장
        nums[4] = 5; // 다섯 번째 요소에 5 저장
        // 배열 요소 출력
        for (int i = 0; i < nums.length; i++) {//nums.length => 길이를 구하는 동작 – method
            int data=nums[i];// nums[i]; => 가져오는 동작 - method
            System.out.println(data);
        }

        //향상된 for문(forEach)
        for (int data: nums) {
            System.out.println(data);
        }
    }
}
