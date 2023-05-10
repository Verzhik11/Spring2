package verzhik.internetshop.services;

import org.springframework.stereotype.Service;
import verzhik.internetshop.components.Box;
import verzhik.internetshop.objects.Item;
import verzhik.internetshop.repositories.StoreRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class StoreService {
    private final Box box;
    private final StoreRepository storeRepository;

    public StoreService(Box box, StoreRepository storeRepository) {
        this.box = box;
        this.storeRepository = storeRepository;
    }

    public void add(Set<Integer> ids) {
        box.add(ids);
    }

    public List<Item> get() {
        return box.get().stream()
                .map(ID->storeRepository.get(ID))
                .collect(Collectors.toList());
    }

}
