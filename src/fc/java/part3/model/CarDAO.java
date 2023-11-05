package fc.java.part3.model;

public class CarDAO {
    //CRUD
    //Create = 저장 : insert
    public void carInsert(CarVO car){
        //DB연결, insert SQL
        System.out.println("car정보가 DB에 저장이 되었습니다.");
    }

    public void carSelect(){
        //DB연결, select SQL
        System.out.println("car정보가 출력이 되었습니다.");
    }
}
