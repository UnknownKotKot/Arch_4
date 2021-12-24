package memento.memento;

import lombok.Data;
import memento.model.CustomerCategory;

@Data
public class CustomerMemento {
    private Long id;
    private String customerName;
    private String customerTel;
    private String customerEmail;
    private String customerAddress;
    private CustomerCategory customerCategory;

    public CustomerMemento(Long id,
                           String customerName,
                           String customerTel,
                           String customerEmail,
                           String customerAddress,
                           CustomerCategory customerCategory) {
        this.id = id;
        this.customerName = customerName;
        this.customerTel = customerTel;
        this.customerEmail = customerEmail;
        this.customerAddress = customerAddress;
        this.customerCategory = customerCategory;
    }
}
