package memento.model;

import lombok.Data;
import memento.memento.CustomerCategoryMemento;

@Data
public class CustomerCategory {
    private Long categoryId;
    private String categoryTitle;


    public CustomerCategoryMemento saveState() {
        return new CustomerCategoryMemento(categoryId, categoryTitle);
    }

    public void restoreState(CustomerCategoryMemento m) {
        categoryId = m.getCategoryId();
        categoryTitle = m.getCategoryTitle();
    }
}
