import java.util.Objects;

public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void changePerson() {
        Person [] person = new Person[]{new Person("Ilya", "Lagytina")};
    }


    @Override
    public String toString() {
        return this.name + this.surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}


