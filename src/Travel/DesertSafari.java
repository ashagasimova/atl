package Travel;

public class DesertSafari extends Tour{
    private String safariName;


    public DesertSafari(String safariName, int tourId, String tourName, double price, TourPackage tourPackage) {
        super(tourId, tourName, price, tourPackage);
        this.safariName = safariName;
    }

    public String getSafariName() {
        return safariName;
    }

    public void setSafariName(String safariName) {
        this.safariName = safariName;
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
        System.out.println("Safarinin adi: " + getSafariName()+ " Tour ID: " + getTourId() + " Tourun adi: " + getTourName() + "Tourun qiymeti: "+
                getPrice() + "Reseerv secimi: " + (isReserved()?"Artiq Reserv olunub" : "Reserv ede bilersiniz") +
                "Tourun tipi: " + getTourPackage());
    }
}
