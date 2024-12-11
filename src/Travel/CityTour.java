package Travel;

public class CityTour extends Tour{
    private String city;


    public CityTour(String city, int tourId, String tourName, double price, TourPackage tourPackage) {
        super(tourId, tourName, price, tourPackage);
        this.city = city;
    }

    @Override
    public void reserveTour() {
        super.reserveTour();
    }

    @Override
    public void cancelReserve() {
        super.cancelReserve();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public void displayInfo() {
        System.out.println("Sheherin adi: " + getCity() + " Tour ID: " + getTourId() + " Tourun adi: " + getTourName() + "Tourun qiymeti: "+
                getPrice() + "Reseerv secimi: " + (isReserved()?"Artiq Reserv olunub" : "Reserv ede bilersiniz") +
                "Tourun tipi: " + getTourPackage());
    }
}
