package composite;

import composite.model.*;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("NPC");
        User user2 = new User("Kate");
        User user3 = new User("Bob");

        Statistic sentToCustomer = new SentToCustomer();
        Statistic interviews = new Interviews();
        Statistic primaryContacts = new PrimaryContacts();

        System.out.println(sentToCustomer.analyse(user1));
        System.out.println("----");
        System.out.println(interviews.analyse(user1));
        System.out.println("----");

        Statistic statistic = new StatisticAggregator().add(sentToCustomer, interviews, primaryContacts);
        statistic.analyse(user2);
        System.out.println("----");
        statistic.analyse(user3);
    }
}
