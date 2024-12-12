package Travel;

public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public Tour(int tourId, String tourName, double price, TourPackage tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = false;
        this.tourPackage = tourPackage;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }


    public void reserveTour(){
        if (!isReserved){
            System.out.println("Rezerv olundu " + getTourName());
            isReserved=true;
        } else {
            System.out.println("Yer qalmayib");
        }
    }

    public void cancelReserve(){
        if (isReserved){
            isReserved=false;
            System.out.println("Reserviniz legv olundu");
        }else {
            System.out.println("Bele bir reserv yoxdur!");
        }
    }

    public void displayInfo(){
        System.out.println("Tour ID: " + tourId + " Tourun adi: " + tourName + "Tourun qiymeti: "+
                price + "$. Reseerv secimi: " + (isReserved?" Artiq Reserv olunub" : " Reserv ede bilersiniz") +
                "Tourun tipi: " + tourPackage);
    }



    @Override
    public String toString() {
        return "Tour{" +
                "tourId=" + tourId +
                ", tourName='" + tourName + '\'' +
                ", price=" + price +
                ", isReserved=" + isReserved +
                ", tourPackage=" + tourPackage +
                '}';
    }
}
