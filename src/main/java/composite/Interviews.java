package composite;

import composite.model.Statistic;
import composite.model.User;

public class Interviews implements Statistic {
    @Override
    public String analyse(User user) {
        return " Number Of Interviews for user:  " + user.getName();
    }
}
