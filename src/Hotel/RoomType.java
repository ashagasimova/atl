package Hotel;

public enum RoomType {
    STANDARD {
        @Override
        public String getDescription() {
            return "Rahat və funksional";

        }
    },
    SUIT {
        @Override
        public String getDescription() {
            return "Lüks və geniş";

        }
    },
    DELUXE {
        @Override
        public String getDescription() {
           return "Zərif və komfortlu";

        }
    };
    public abstract String getDescription();


}
