import java.util.Objects;

public class Room {
    private TypeRoom typeRoom;
    private String color;
    private int numberOfDoors;
    private int numberOfWindows;
    private int numberOfFurniture;
    private int numberOfChandeliers;

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Room room = (Room) o;
        return numberOfDoors == room.numberOfDoors && numberOfWindows == room.numberOfWindows && numberOfFurniture == room.numberOfFurniture && numberOfChandeliers == room.numberOfChandeliers && typeRoom == room.typeRoom && color.equals(room.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeRoom, color, numberOfDoors, numberOfWindows, numberOfFurniture, numberOfChandeliers);
    }

    public TypeRoom getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(final TypeRoom typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(final int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(final int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getNumberOfFurniture() {
        return numberOfFurniture;
    }

    public void setNumberOfFurniture(final int numberOfFurniture) {
        this.numberOfFurniture = numberOfFurniture;
    }

    public int getNumberOfChandeliers() {
        return numberOfChandeliers;
    }

    public void setNumberOfChandeliers(final int numberOfChandeliers) {
        this.numberOfChandeliers = numberOfChandeliers;
    }

    public Room(final String color, final TypeRoom typeRoom, final int numberOfDoors, final int numberOfWindows,
                final int numberOfFurniture, final int numberOfChandeliers)  {
        this.color = color;
        this.typeRoom = typeRoom;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.numberOfFurniture = numberOfFurniture;
        this.numberOfChandeliers = numberOfChandeliers;
    }

    public void buildDoors() {
        numberOfDoors++;
    }
    public void buildWindows() {
        numberOfWindows++;
    }
    public void addFurniture() {
        numberOfFurniture++;
    }
    public void addChandeliers() {
        numberOfChandeliers++;
    }

    public void demolishDoors() {
        if(numberOfDoors > 0){
            numberOfDoors--;
        }else {
            System.out.println("Impossible demolish door");
        }
    }
    public void demolishWindows() {
        if(numberOfWindows > 0){
            numberOfWindows--;
        }else {
            System.out.println("Impossible demolish Window");
        }
    }
    public void takeAwayFurniture() {
        if(numberOfFurniture > 0){
            numberOfFurniture--;
        }else {
            System.out.println("Impossible take away Furniture");
        }
    }
    public void takeAwayChandeliers() {
        if(numberOfChandeliers > 0){
            numberOfChandeliers--;
        }else {
            System.out.println("Impossible take away Chandeliers");
        }
    }
    public void ColorRoom(final String color) {
        setColor(color);
    }

    public void changeTypeRoom(final TypeRoom typeRoom) {
        setTypeRoom(typeRoom);
    }
    public String toString() {
        return "Room: "  + "color=" + color + ", typeRoom=" + typeRoom + " " + ", numberOfDoors="
                + numberOfDoors + ", numberOfWindows=" + numberOfWindows + ", numberOfFurniture="
                + numberOfFurniture + ", numberOfChandeliers=" + numberOfChandeliers;
    }
}
