package Game;

import tag.RoomAndChest.Room;

public class Monster extends Player {

    private String name;
    private Room currentRoom;

    public Monster(String name, Room currentRoom) {
        this.name = name;
        this.currentRoom = currentRoom;
    }

    public void move() {
        int select = (int) (Math.random() * 4) + 1;

        super.move(select);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Room getCurrentRoom() {

        return currentRoom;

    }

    @Override
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

}
