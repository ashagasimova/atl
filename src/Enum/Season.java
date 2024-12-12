package Enum;

public enum Season {
    WINTER(15,-5, " En soyuq fesildir"),
    SPRING(25,5, "Tebiet canlanir" ),
    SUMMER(42,20, " En isti fesil"),
    FALL(20,3, "Qizil payiz");

    private final int maxTemp;
    private final int minTemp;
    private final String description;

    Season(int maxTemp, int minTemp, String description) {
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.description = description;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public String getDescription() {
        return description;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public String  getFormatInfo(){
        return String.format("%s: %d℃ - %dC (%s)",
                this.name(), minTemp, maxTemp , description);
    }


}
