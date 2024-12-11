package Travel;

public class MountainAdventure extends Tour {
    private String mountain;


    public MountainAdventure(String mountain, int tourId, String tourName, double price, TourPackage tourPackage) {
        super(tourId, tourName, price, tourPackage);
        this.mountain=mountain;
    }

    public String getMountain() {
        return mountain;
    }

    public void setMountain(String mountain) {
        this.mountain = mountain;
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
        System.out.println("Dagin adi: " + getMountain()+ " Tour ID: " + getTourId() + " Tourun adi: " + getTourName() + "Tourun qiymeti: "+
                getPrice() + "Reseerv secimi: " + (isReserved()?"Artiq Reserv olunub" : "Reserv ede bilersiniz") +
                "Tourun tipi: " + getTourPackage());
    }
}
