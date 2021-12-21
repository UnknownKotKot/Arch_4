package composite;

import composite.model.Statistic;
import composite.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatisticAggregator implements Statistic {
    private List<Statistic> statistics = new ArrayList<>();

    @Override
    public String analyse(User user) {
        for (Statistic statistic : statistics) {
            System.out.println(statistic.analyse(user));
        }
        return "end of list";
    }

    public Statistic add(Statistic... statistics) {
        this.statistics.addAll(Arrays.asList(statistics));
        return this;
    }
}
