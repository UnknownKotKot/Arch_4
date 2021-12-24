package memento.memento;

import lombok.Data;

@Data
public class CustomerCategoryMemento {
        private Long categoryId;
        private String categoryTitle;

        public CustomerCategoryMemento(Long categoryId, String categoryTitle) {
                this.categoryId = categoryId;
                this.categoryTitle = categoryTitle;
        }
}
