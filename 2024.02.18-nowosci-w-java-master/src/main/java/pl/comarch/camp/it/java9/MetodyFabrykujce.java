package pl.comarch.camp.it.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MetodyFabrykujce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>(list2);
        list3.add(100);


        metoda(5,6,4,23,23,45,23,5,2,5,25,25,225);

        Set<String> set = Set.of("123", "3214", "asdf", "asdtf", "wsdf4");
        System.out.println(set);

        Map<Integer, String> map = Map.of(1, "v1", 2, "v2", 3, "v3");
        System.out.println(map);

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "v1"),
                Map.entry(2," v2"),
                Map.entry(3, "v3"),
                Map.entry(4, "v4"),
                Map.entry(5, "v5"),
                Map.entry(6, "v6"),
                Map.entry(7, "v7"),
                Map.entry(8, "v8"),
                Map.entry(9, "v9"),
                Map.entry(10, "v10"),
                Map.entry(11, "v11"),
                Map.entry(12, "v12"),
                Map.entry(13, "v13")
        );


        List<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(5);
        list4.add(7);
        list4.add(9);
        list4.add(12);
        list4.add(14);

        List<Integer> list5 = list4.stream().collect(Collectors.toList());
        list5.add(100);
    }


    public static void metoda(int... x) {
        System.out.println(x[10]);
    }
}
