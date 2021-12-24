package memento;

import memento.memento.CustomerMemento;

public class CustomerLogger {
    private CustomerMemento customerMemento;

    public CustomerMemento getState() {
        return customerMemento;
    }

    public void setState(CustomerMemento newMemento) {
        customerMemento = newMemento;
    }
}
