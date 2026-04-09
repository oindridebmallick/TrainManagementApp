public class Bogie {
    private String bogieId;
    private String type;
    private int capacity;

    public Bogie(String bogieId, String type, int capacity) {
        this.bogieId = bogieId;
        this.type = type;
        this.capacity = capacity;
    }

    public String getBogieId() {
        return bogieId;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie ID: " + bogieId + ", Type: " + type + ", Capacity: " + capacity;
    }
}