package verzhik.internetshop.objects;

import java.util.Objects;

public class Item {
    String name;
    int ID;

    public Item(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return ID == item.ID && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

}
