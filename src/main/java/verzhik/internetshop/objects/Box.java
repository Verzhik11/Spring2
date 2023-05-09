package verzhik.internetshop.objects;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
@Component
@SessionScope
public class Box {
    Set<Integer> ids;

    public Box(Set<Integer> ids) {
        this.ids = new HashSet<>();
    }

    public void add (Set<Integer>ids) {
        this.ids.addAll(ids);
    }
    public Set<Integer> get() {
        return Collections.unmodifiableSet(ids);
    }
}
