package pl.comarch.camp.it.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KopiowanieKolekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        System.out.println(list);
        List<Integer> list2 = List.copyOf(list);
        System.out.println(list2);
        //list2.add(10);


        Set<String> set = Set.of("asdf", "Asdf", "ghjkgh", "gfdshs");
        Set<String> set2 = Set.copyOf(set);
        System.out.println(set);
        System.out.println(set2);
    }
}
