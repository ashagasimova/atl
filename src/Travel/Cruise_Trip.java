package Travel;

public class Cruise_Trip extends Tour {

        private String cruiseName;


    public Cruise_Trip(String cruiseName,int tourId, String tourName, double price, TourPackage tourPackage) {
        super(tourId, tourName, price, tourPackage);
        this.cruiseName = cruiseName;
    }

    public String getCruiseName() {
        return cruiseName;
    }

    public void setCruiseName(String cruiseName) {
        this.cruiseName = cruiseName;
    }

    @Override
    public void reserveTour() {
        super.reserveTour();
    }

    @Override
    public void cancelReserve() {
        super.cancelReserve();
    }

    @Override
    public void displayInfo() {
        System.out.println("Geminin adi: " + getCruiseName()+ " Tour ID: " + getTourId() + " Tourun adi: " + getTourName() + "Tourun qiymeti: "+
                getPrice() + "Reseerv secimi: " + (isReserved()?"Artiq Reserv olunub" : "Reserv ede bilersiniz") +
                "Tourun tipi: " + getTourPackage());
    }
}

