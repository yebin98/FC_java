package fc.java.part3;

import fc.java.part3.model.CarDAO;
import fc.java.part3.model.CarVO;

import java.util.Scanner;

public class CarCRUDTest {
    public static void main(String[] args) {
        //Q. 자동차 정보를 키보드로 부터 입력을 받아서 DB에 저장을 하세요(JDBC)
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

        //자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO, VO)
        //클래스로 CarDTO, CarVO 모델로 설계
        CarVO car = new CarVO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
