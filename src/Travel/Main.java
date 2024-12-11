package Travel;

public class Main {

    public static void main(String[] args) {

        Tour beachHoliday = new Tour(032, "Ocean Adventure",
                156,TourPackage.BEACH_HOLIDAY);

        Tour cityTour = new Tour(512 , "City Lights Adventure",
                180, TourPackage.CITY_TOUR);

        Tour mountainTour = new Tour(172, "Whispers of the Mountains",
                120, TourPackage.MOUNTAIN_ADVENTURE);

        Tour cruiseTour = new Tour(215,"Waves Experience",
                162, TourPackage.CRUISE_TRIP);

        Tour desertSafari = new Tour(196,"Sunset Sands Safari",
                210, TourPackage.DESERT_SAFARI);

        beachHoliday.reserveTour();
        beachHoliday.cancelReserve();
        beachHoliday.displayInfo();




}
}