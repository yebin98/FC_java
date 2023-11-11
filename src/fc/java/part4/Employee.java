package fc.java.part4;

//사원(VO, DTO)
public class Employee extends Object{ //extends Object 생략
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;
    public Employee() {
        super(); // -> 생략 가능// 상위클래스의 생성자 호출 -> new Object()(최상위 클래스)가 먼저 만들어짐
    }

    public Employee(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate = empDate;
        this.dept = dept;
        this.marriage = marriage;
    }

    //toString()
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
