import java.util.List;

public class House {
    private List<Room> rooms;
    private String material;
    private String street;

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(final List<Room> rooms) {
        this.rooms = rooms;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(final String material) {
        this.material = material;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }


    public House(final List<Room> rooms, final String material, final String street) {
        this.rooms = rooms;
        this.material = material;
        this.street = street;
    }

    public String toString() {
        final StringBuilder repair = new StringBuilder();
        for (final var room : rooms) {
            repair.append(room).append('\n');
        }
        return "House: " +
                "rooms=\n" + repair +
                ", material=" + material + ", street=" + street;
    }
}
