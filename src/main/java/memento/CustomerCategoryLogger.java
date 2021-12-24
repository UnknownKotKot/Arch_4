package memento;

import memento.memento.CustomerCategoryMemento;

public class CustomerCategoryLogger {
    private CustomerCategoryMemento customerCategoryMemento;

    public CustomerCategoryMemento getState() {
        return customerCategoryMemento;
    }

    public void setState(CustomerCategoryMemento newMemento) {
        customerCategoryMemento = newMemento;
    }
}
