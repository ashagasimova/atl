package Travel;

import java.util.List;

public class Customer {
    private int customerId;
    private List<Tour> reserveTours;

    public Customer(int customerId, List<Tour> reserveTours) {
        this.customerId = customerId;
        this.reserveTours = reserveTours;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Tour> getReserveTours() {
        return reserveTours;
    }

    public void setReserveTours(List<Tour> reserveTours) {
        this.reserveTours = reserveTours;
    }


    public void reserveTour(Tour tour){
        if (!tour.isReserved()){
            tour.reserveTour();
            reserveTours.add(tour);
            System.out.println("Tour " + tour.getTourName() + " paket sizin siyahiniza elave edildi");
        } else {
            System.out.println("Paket artiq reserv olunub");
        }

    }

    public void cancelReserve(Tour tour){
        if (reserveTours.contains(tour)){
            tour.cancelReserve();
            reserveTours.remove(tour);
            System.out.println("Tour "+tour.getTourName()+"siyahinizdan silindi");
        }
        else {
            System.out.println("Artiq reserve legv olunub");

        }
    }

    public void customerInfo(){
        System.out.println("Customer{" +
                "customerId=" + customerId +
                ", reserveTours=" + reserveTours +
                '}');
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", reserveTours=" + reserveTours +
                '}';
    }
}
