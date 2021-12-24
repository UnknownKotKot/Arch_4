package memento;

import memento.model.Customer;
import memento.model.CustomerCategory;

public class Main {
    public static void main(String[] args) {
        CustomerCategory customerCategory = new CustomerCategory();
        customerCategory.setCategoryId(1L);
        customerCategory.setCategoryTitle("title");
        System.out.println(customerCategory.getCategoryId() + customerCategory.getCategoryTitle());

        CustomerCategoryLogger logger = new CustomerCategoryLogger();
        logger.setState(customerCategory.saveState());
        customerCategory.setCategoryTitle("new Title");
        customerCategory.setCategoryId(2L);
        System.out.println(customerCategory.getCategoryId() + customerCategory.getCategoryTitle());

        customerCategory.restoreState(logger.getState());
        System.out.println(customerCategory.getCategoryId() + customerCategory.getCategoryTitle());

        Customer customer = new Customer();
        customer.setCustomerAddress("testAddress");
        customer.setCustomerCategory(customerCategory);
        customer.setCustomerEmail("testEmail");
        customer.setCustomerName("testName");
        customer.setCustomerTel("testtel");
        customer.setId(1L);
        System.out.println(customer.toString());

        CustomerLogger customerLogger = new CustomerLogger();
        customerLogger.setState(customer.saveState());

        CustomerCategory customerCategory2 = new CustomerCategory();
        customer.setCustomerCategory(customerCategory2);
        System.out.println(customer.toString());
        customer.restoreState(customerLogger.getState());
        System.out.println(customer.toString());
    }
}
