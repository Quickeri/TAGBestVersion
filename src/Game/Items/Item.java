package Game.Items;

public abstract class Item {

    private String name, description;
    private int itemPoints;
    

    public Item(String name, String description, int itemPoints) {
        this.name = name;
        this.itemPoints = itemPoints;
        this.description = description;
  
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getItemPoints() {
        return itemPoints;
    }

    public void setItemPoints(int itemPoints) {
        this.itemPoints = itemPoints;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
