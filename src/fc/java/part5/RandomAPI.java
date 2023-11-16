package fc.java.part5;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand = new Random();//객체 생성 -> 클래스 이므로
        int[] arr = new int[6];
        int i= 0; //저장위치(pos) -> 배열 첫번째 부터 시작
        while (i < 6) { //배열 0번째 ~ 5번째 출력
            int num = rand.nextInt(45) + 1; //1부터 45 사이의 난수를 반환
            boolean isDuplicate = false; //isDuplicate (중복) 초기값 : false 중복 안 됨

            // 배열의 이전 인덱스들과 비교하여 중복되는지 확인합니다.
            for (int j = 0; j < i; j++) {// 탐색( j=0부터 i보다 작을 때 까지 )
                if (arr[j] == num) {
                    isDuplicate = true;// 중복 됨
                    break;//if문 실행 시(중복시) isDuplicate = true로 반복문 탈출
//                    return; // if문에서만 탈출하기 때문에 사용하면 안됨
                }
            }
            // 중복되지 않으면 배열에 추가합니다.
            if (!isDuplicate) {//중복이 아니면
                arr[i++] = num;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
