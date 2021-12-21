package composite;

import composite.model.Statistic;
import composite.model.User;

public class PrimaryContacts implements Statistic {
    @Override
    public String analyse(User user) {
        return " Number Of Primary Contacts for user:  " + user.getName();
    }
}
