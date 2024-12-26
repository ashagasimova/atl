package StreamLEesson;

public class Phone {

    private Integer phoneNumber;

    public Phone(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
