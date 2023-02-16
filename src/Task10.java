import java.util.List;

public class Task10 {
    public static void main(final String[] args) {

        final House house = new House(List.of(
                new Room("White", TypeRoom.Living_room, 2, 3, 8, 2),
                new Room("White", TypeRoom.Bedroom, 1, 2, 4, 2),
                new Room("White", TypeRoom.Children_room, 2, 1, 8, 1),
                new Room("White", TypeRoom.Toilet, 1, 1, 5, 1),
                new Room("White", TypeRoom.Bath, 2, 1, 2, 2),
                new Room("White", TypeRoom.Kitchen, 2, 2, 3, 1),
                new Room("White", TypeRoom.Corridor, 1, 3, 6, 1)),
                "wooden", "Avtozavodskaya str.");

        System.out.println("Before the renovation of the first room:");
        System.out.println(house);

        System.out.println("After:");
        house.getRooms().get(0).ColorRoom("Orange");
        house.getRooms().get(0).demolishDoors();
        house.getRooms().get(0).buildWindows();
        house.getRooms().get(0).takeAwayChandeliers();
        System.out.println(house);
    }
}
