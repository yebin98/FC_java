package fc.java.part6.model;

import fc.java.part5.model.Person;

@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);
}
