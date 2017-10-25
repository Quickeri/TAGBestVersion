package tag.RoomAndChest;

public class Chest {

    public String name;
    public String item;

    
    
    public Chest(String name, String item) {
        this.name = name;
        this.item = item;
    }

    public void openChest() {

    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
@Override
    public String toString() {
        return  name;
    }
}
