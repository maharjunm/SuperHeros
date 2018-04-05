package splitwise;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private Parser parser;

    public Factory(Parser parser) {
        this.parser = parser;
    }

    public List<Transaction> createTransactions(String list[]) {
        List<Transaction> transactions = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            String[] parsedList = parser.parse(list[0]);
            for (int j = 0; j < parsedList.length; j++) {
                transactions.add(createTransaction(parsedList));
            }
        }
        return transactions;
    }

    private Transaction createTransaction(String[] list) {
        Person person = new Person(list[0], 0, 0);
        String[] personsNames = parser.parsePerson(list[list.length - 1]);
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < personsNames.length; i++) {
            Person newPerson = new Person(personsNames[i], 0, 0);
            if (person.equals(newPerson)) {
                 people.add(person);
            } else {
                people.add(newPerson);
            }
        }
        return new Transaction(person, Integer.parseInt(list[2]), list[4], people);
    }
}
