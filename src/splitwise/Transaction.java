package splitwise;

import java.util.List;

public class Transaction {
    private final Person person;
    private final int money;
    private final String thingsPaidFor;
    private final List<Person> paidFor;

    public Transaction(Person person, int money, String thingsPaidFor, List<Person> paidFor) {
        this.person = person;
        this.money = money;
        this.thingsPaidFor = thingsPaidFor;
        this.paidFor = paidFor;
    }

    public int getMoney() {
        return money;
    }

    public String getThingsPaidFor() {
        return thingsPaidFor;
    }

    public Person getPerson() {
        return person;
    }

    public List<Person> getPaidFor() {
        return paidFor;
    }
}
