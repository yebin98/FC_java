package fc.java.part4;

import fc.java.part4.poly.*;

public class ObjectPolyArray {
    public static void main(String[] args) {
        //A, B클래스를 저장할 배열을 생성하세요
        Object[] obj=new Object[2]; // 다형성 배열
        obj[0]=new A(); //Upcasting
        obj[1]=new B(); //Upcasting

        display(obj);

//        for(int i=0;i<obj.length;i++){
//            if(obj[i] instanceof A){
//                ((A)obj[i]).printGo(); //DownCasting
//            }else{
//                ((B)obj[i]).printGo(); //DownCasting
//            }
//        }

    }

    private static void display(Object[] obj) {
        for(int i=0;i<obj.length;i++){
            if(obj[i] instanceof A){
                ((A)obj[i]).printGo(); //DownCasting
            }else{
                ((B)obj[i]).printGo(); //DownCasting
            }
        }
    }
}
