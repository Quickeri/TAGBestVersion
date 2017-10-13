package tag;

public class Item {

    private String name;
//private int points; //every item gives a point at the end of the game

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
