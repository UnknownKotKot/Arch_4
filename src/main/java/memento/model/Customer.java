package memento.model;

import lombok.Data;
import memento.memento.CustomerMemento;

@Data
public class Customer {
    private Long id;
    private String customerName;
    private String customerTel;
    private String customerEmail;
    private String customerAddress;
    private CustomerCategory customerCategory;

    public CustomerMemento saveState() {
        return new CustomerMemento(id, customerName, customerTel, customerEmail, customerAddress, customerCategory);
    }

    public void restoreState(CustomerMemento m) {
        id = m.getId();
        customerName = m.getCustomerName();
        customerTel = m.getCustomerTel();
        customerEmail = m.getCustomerEmail();
        customerAddress = m.getCustomerAddress();
        customerCategory = m.getCustomerCategory();
    }

}
