package fc.java.part5.model;

import java.util.Arrays;

// 정수 3개 배열처럼 동작하는 클래스
public class IntArray {
    private static final int DEFAULT_CAPACITY = 5; // static : 다른 클래스에도 접근 가능, final : 상수(수정 불가), DEFAULT_CAPACITY : 초기 용량(크기)
    private int[] elements; //정수 여러개 져장 -> int형 배열
    private int size = 0; // 가지고 있는 원소의 개수 -> 초기값(현재 가지고 있는 원소의 개수)
    public IntArray() { //생성동작
        elements = new int[DEFAULT_CAPACITY]; // 생성자 //배열(객체) 의 타입으로 초기화 -> int의 기본값 : 0 elements.length : 5개 크기 배열
    }
    public int size() {// 가지고 있는 원소 개수(크기)를 구하는 동작(넘겨주는 동작)
        return size;
    }
    public int get(int index) {//가져오는 동작(얻는 동작)
        //index 체크
        if (index < 0 || index >= size) {//인덱스가 음수거나 사이즈보다 같거나 크면
            //에러상황 -> throw -> JVM -> 에러 메세지 출력 -> 프로그램 종료
            throw new IndexOutOfBoundsException("범위초과");//예외상황(클래스) : 인덱스 경계(범위) 벗어남 -> 에러 객체 생성 => 예외(객체 취급)
        }
        return elements[index];
    }
    public void add(int element) { //저장하는(추가) 동작
        //크기 체크
        if (size == elements.length) {
            //크기를 2배로 늘리는 작업
            ensureCapacity();//공간을 늘려야 한다.
        }
        elements[size++] = element;
    }

    //공간을 늘리는 메서드(함수)
    private void ensureCapacity() {
        int newCapacity = elements.length * 2;//2배의 크기
        elements = Arrays.copyOf(elements, newCapacity);//(기존배열, 새로운배열)
    }
}
