package StreamLEesson;

public class Customer {
    private String name;
    private Integer debt;

    public Customer(String name, Integer debt) {
        this.name = name;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDebt() {
        return debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", debt=" + debt +
                '}';
    }
}
