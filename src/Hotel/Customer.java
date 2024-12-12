package Hotel;

import java.util.List;

public class Customer {
    private String customerName;
    private List<Room> reserveRooms;

    public Customer(String customerName, List<Room> reserveRooms) {
        this.customerName = customerName;
        this.reserveRooms = reserveRooms;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Room> getReserveRooms() {
        return reserveRooms;
    }

    public void setReserveRooms(List<Room> reserveRooms) {
        this.reserveRooms = reserveRooms;
    }

    public void reserveRoom(Room room){
        if (!room.isBooked()){
            room.Reserve();
            System.out.println("Otaq reserv olundu " + room.getRoomNumber());
            reserveRooms.add(room);
        } else {
            System.out.println("Otaq artiq reserv olunub");
        }
    }

    public void cancelReserve(Room room){
        if (reserveRooms.contains(room)){
            room.CancelReserve();
            System.out.println("Reserviniz legv olundu " + room.getRoomNumber());
            reserveRooms.remove(room);
        } else {
            System.out.println("Reserv yoxdur");
        }
    }

    public void customerInfo(){
        System.out.println("Customer{" +
                "customerName='" + customerName + '\'' +
                ", reserveRooms=" + reserveRooms +
                '}');
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", reserveRooms=" + reserveRooms +
                '}';
    }
}
