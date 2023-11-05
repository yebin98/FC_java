package fc.java.part3;

import fc.java.part3.model.CarVO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 [키보드로부터 입력] 받아서 [다른 메서드]로 이동 해야 되는 경우를 생각해보자.
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련번호 : ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = scan.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유자 : ");
        String carOwner = scan.nextLine();

        System.out.print("자동차 년식 : ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입 : "); // G : 휘발류 , D : 경유
        String carType = scan.nextLine();

//        1. System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType+"\t");

//        2. carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);

        //자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO, VO)
        //클래스로 CarDTO, CarVO 모델로 설계
        CarVO car = new CarVO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        carInfoPrint(car);//call by reference(번지)

    }

    //Q. 매개변수로 자동차를 정보를 받아서 출력하는 메서드를 정의하세요.
//    2. public static void carInfoPrint(int carSn, String carName, int carPrice, String carOwner, int carYear, String carType){
//        System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType+"\t");
//    }
    public static void carInfoPrint(CarVO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType+"\t");
    }
}
