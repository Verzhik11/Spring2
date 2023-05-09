package verzhik.internetshop.repositories;

import org.springframework.stereotype.Repository;
import verzhik.internetshop.objects.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StoreRepository {
    private int idCounter = 1;
    private final Map<Integer, Item> store;

    public StoreRepository(Map<Integer, Item> store) {
        this.store = new HashMap<>();
    }
    public void init () {
        store.put(idCounter, new Item("Холодильник", idCounter++));
        store.put(idCounter, new Item("Диван", idCounter++));
        store.put(idCounter, new Item("Кровать", idCounter++));
    }

    public void add(Item item) {
        store.put(item.getID(), item);
    }

    public Item get(int ID) {
        return store.get(ID);
    }

    public List<Item> getAll() {
        return new ArrayList<>(store.values());
    }

    public void update(int ID, Item item) {
        if (store.containsKey(ID)) {
            store.replace(ID, item);
        }
    }

    public Item delete(int ID) {
        return store.remove(ID);
    }
}
