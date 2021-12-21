package composite;

import composite.model.Statistic;
import composite.model.User;

public class SentToCustomer implements Statistic {
    @Override
    public String analyse(User user) {
        return " Number Of Sent To Customer for user:  " + user.getName();
    }
}
