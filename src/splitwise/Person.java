package splitwise;

public class Person {
    private String name;
    private float given;
    private float get;

    Person(String name, float given, float get) {
        this.name = name;
        this.given = given;
        this.get = get;
    }

    public float getGiven() {
        return given;
    }

    public float getGet() {
        return get;
    }

    public void setGiven(float given) {
        this.given = given;
    }

    public void setGet(float get) {
        this.get = get;
    }

    String getName() {
        return name;
    }

    @Override
    public boolean equals(Object person) {
        Person person1 = (Person) person;
        return this.name.equals(person1.getName());
    }
}
