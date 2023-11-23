package fc.java.part5;

public class StringManipulation {
    public static void main(String[] args) {
        String str =new String("HelloWorld");//"HelloWorld" 라는 문자열을 생성하시오

        char firstChar = str.charAt(1);//1번에 있는 문자출력 'e'
        String replacedString = str.replaceAll("o", "X");//"o"를 "X"로 치환 문자 하나라 하더라도 쌍따옴표를 사용해야함
        int index = str.indexOf("W"); //
        int indexS = str.indexOf("Wo");//첫번쨰 인덱스 가져옴
        int indexN = str.indexOf("Wr");//없으면 -1 출력
        int length = str.length();//길이 : 10
        String upperCase = str.toUpperCase();//모두 대문자로 변경
        String lowerCase = str.toLowerCase();//모두 소문자로 변경
        String substring = str.substring(5);//시작부터 끝까지

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("");

        System.out.println(firstChar);
        System.out.println(replacedString);
        System.out.println(index);
        System.out.println(indexS);
        System.out.println(indexN);
        System.out.println(length);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(substring);
    }
}
