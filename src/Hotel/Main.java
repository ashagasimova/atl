package Hotel;

import arrays.Array;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelRegister register = new HotelRegister("Hilton");

        Room room1 = new Room(12, 120, RoomType.SUIT);
        Room room2 = new Room(13, 250, RoomType.DELUXE);
        Room room3 = new Room(24, 200, RoomType.SUIT);

        register.addRoom(room1);
        register.addRoom(room2);
        register.addRoom(room3);
        System.out.println();

        room1.Reserve();
        room1.CancelReserve();
        room2.Reserve();

        System.out.println(RoomType.STANDARD.getDescription());
        register.addCustomer(new Customer("Ayan", List.of(room1, room2)));

        register.customerInfo();
        register.roomInfo();

    }
}
