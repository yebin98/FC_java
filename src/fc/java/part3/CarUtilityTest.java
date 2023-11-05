package fc.java.part3;

import fc.java.part3.model.CarUtility;
import fc.java.part3.model.CarVO;

public class CarUtilityTest {
    public static void main(String[] args) {
        //Q. Car 정보를 출력하는 동작을 가지고있는 Utility클래스를 설계하세요.
        int carSn = 1110;
        String carName ="BMW528i";
        int carPrice = 9000000;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G"; //'G' -> char

        // 데이터를 하나로 묶는다(이동 시키기 쉬움)
        CarVO car = new CarVO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        //carPrint(car);

        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);

    }
    // 매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하세요.
//    public static void carPrint(CarVO car){
//        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType+"\t");
//    }
}
