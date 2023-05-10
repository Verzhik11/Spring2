package verzhik.internetshop.controllers;

import org.apache.catalina.Store;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import verzhik.internetshop.objects.Item;
import verzhik.internetshop.services.StoreService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class controllerStore {
    private final StoreService storeService;

    public controllerStore(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping
    public String start() {
        return "Hello";
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> id) {
        storeService.add(id);
    }
    @GetMapping("/get")
    public List<Item> get() {
        return storeService.get();
    }
}
