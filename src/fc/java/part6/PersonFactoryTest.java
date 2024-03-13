package fc.java.part6;

import fc.java.part5.model.Person;
import fc.java.part6.model.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
        //4. 생성자 참조: 클래스명::new
//        PersonFactory personFactory = Person::new;
//        Person person = personFactory.create("John Doe", 30);
//        System.out.println("person = " + person);

        //익명내부클래스
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person = personFactory.create("John Doe2", 30);
        System.out.println("person = " + person);
    }
}
