package Travel;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TravelAgency agency = new TravelAgency("Dream Tours");


        Tour tour1 = new Tour(24, "Deniz turu", 75, TourPackage.CRUISE_TRIP);
        Tour tour2 = new Tour(26, "Sehra turu", 68, TourPackage.DESERT_SAFARI);
        Tour tour3 = new Tour(28, "Cimerlik turu", 85, TourPackage.DESERT_SAFARI);
        Tour tour4 = new Tour(32, "Dag turu", 110, TourPackage.MOUNTAIN_ADVENTURE);

        agency.addTour(tour1);
        agency.addTour(tour2);
        agency.addTour(tour3);
        agency.addTour(tour4);

        agency.displayTour();
        agency.displayCustomer();
        agency.addCustomer(new Customer(032, Arrays.asList(tour1, tour2, tour3, tour4)));
        Customer customer = new Customer(1, List.of(tour1, tour2));
        agency.addCustomer(customer);
        System.out.println();
        agency.displayCustomer();
        tour1.reserveTour();
        tour1.cancelReserve();
        tour2.reserveTour();





}
}