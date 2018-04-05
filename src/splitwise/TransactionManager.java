package splitwise;

import java.util.HashSet;
import java.util.List;

public class TransactionManager {
    private List<Transaction> transactions;

    public TransactionManager(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void transact() {
        for (int i = 0; i < transactions.size(); i++) {
            Transaction transaction = transactions.get(i);
            float money = (float) transaction.getMoney() / transaction.getPaidFor().size();
            transaction.getPerson().setGiven(transaction.getMoney());
            for (int j = 0; j < transaction.getPaidFor().size(); i++) {
                transaction.getPerson().setGet(money);
            }
        }
    }

    public HashSet<Person> getPersons() {
        HashSet<Person> list = new HashSet<>();
        for (int i = 0; i < transactions.size(); i++) {
            list.add(transactions.get(i).getPerson());
            List<Person> people = transactions.get(i).getPaidFor();
            for (int j = 0; j < people.size(); j++) {
                if (!list.contains(people.get(i))) {
                    list.add(people.get(j));
                }
            }
        }
        return list;
    }
}
