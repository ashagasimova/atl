package Travel;

public class BeachHoliday extends Tour{
    private String beach;

    public BeachHoliday(String beach, int tourId, String tourName, double price, TourPackage tourPackage) {
        super(tourId, tourName, price, tourPackage);
        this.beach = beach;
    }

    public String getBeach() {
        return beach;
    }

    public void setBeach(String beach) {
        this.beach = beach;
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
        System.out.println("Cimerliyin adi: " + getBeach() + " Tour ID: " + getTourId() + " Tourun adi: " + getTourName() + "Tourun qiymeti: "+
                getPrice() + "Reseerv secimi: " + (isReserved()?"Artiq Reserv olunub" : "Reserv ede bilersiniz") +
                "Tourun tipi: " + getTourPackage());

    }
}
