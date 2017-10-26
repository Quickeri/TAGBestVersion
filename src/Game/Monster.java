package Game;

import tag.RoomAndChest.Room;

public class Monster extends Player {

    private String name;

    /**
     * Constructs monster.
     *
     * @param name
     * @param currentRoom
     */
    public Monster(String name, Room currentRoom) {
        this.name = name;
        this.currentRoom = currentRoom;
    }

    /* Monsters move method.
    *
    *The monster moves 1 of 4 ways north south east and west.
    *If the monter selects a way were there isnt a door it stays in this current room.
    *
     */
    public void move() {
        int select = (int) (Math.random() * 4) + 1;
        
        super.move(select);
        System.out.println("-----------------------------");
        System.out.println("Monster is in" + currentRoom.getRoomName());
        System.out.println("-----------------------------");
    }

    /**
     * Method for getting the monsters name.
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Method for getting the monsters current room.
     *
     * @return
     */
    @Override
    public Room getCurrentRoom() {

        return currentRoom;

    }

    /**
     * Method for setting the monsters current room
     *
     * @param currentRoom
     */
    @Override
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

}
