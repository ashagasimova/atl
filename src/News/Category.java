package News;

public class Category <T>{
    private T categoryName;

    public Category(T categoryName) {
        this.categoryName = categoryName;
    }

    public T getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(T categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName=" + categoryName +
                '}';
    }

}
