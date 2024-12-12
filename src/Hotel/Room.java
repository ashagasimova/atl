package Hotel;

public class  Room {

    private int roomNumber;
    private double price;
    private boolean isBooked;
    private RoomType roomType;

    public Room(int roomNumber, double price, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = true;
        this.roomType= roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public  void displayInfo(){
    };


    public void Reserve(){
        if(isBooked){
            System.out.println("Otaq artiq reserv olundu "+ getRoomNumber());
            isBooked=false;
        } else {
            System.out.println("Otaq doludur" );
        }
    }

    public void CancelReserve(){
        if (!isBooked){
            isBooked=true;
            System.out.println("Sizin rezerv legv olundu");
        } else {
            System.out.println("Reserve olunmayib, otaq bosdur.");
        }
    }

    public void roomInfo(){
        System.out.println("Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}');
    }


    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }



}
