package Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelRegister {
    private String hotelName;
    private List<Room> rooms;
    private List<Customer> customers;

    public HotelRegister(String hotelName) {
        this.hotelName = hotelName;
        this.rooms = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
        System.out.println("Otaq elave olundu " + room.getRoomNumber());
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Musteri elave olunud " + customer.getCustomerName());
    }

    public void customerInfo(){
        for (Customer customer: customers){
            customer.customerInfo();
        }

    }

    public void roomInfo(){
        for (Room room : rooms){
            room.roomInfo();
        }
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "HotelRegister{" +
                "hotelName='" + hotelName + '\'' +
                ", rooms=" + rooms +
                ", customers=" + customers +
                '}';
    }
}
