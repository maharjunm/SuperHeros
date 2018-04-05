package splitwise;

import java.util.HashSet;

public class Starter {
    public static void main(String[] args) {
        String[] list = new String[3];
        list[0] = "A spent 100 for snacks for A,B,C,D";
        list[1] = "B spent 500 for taxi for C,D";
        list[2] = "D spent 600 for A,D";
        Parser parser = new Parser();
        Factory factory = new Factory(parser);
        TransactionManager transactionManager = new TransactionManager(factory.createTransactions(list));
        HashSet<Person> people = transactionManager.getPersons();
        for (Person person : people) {
            float given = person.getGiven();
            float get = person.getGet();
            if(given > get) {
                System.out.println(person.getName() + " Gets " + (given-get));
            } else {
                System.out.println(person.getName() + " gives " + (get-given));
            }
        }
    }
}
