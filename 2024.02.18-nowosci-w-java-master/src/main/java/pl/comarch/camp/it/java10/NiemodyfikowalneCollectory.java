package pl.comarch.camp.it.java10;

import java.util.List;
import java.util.stream.Collectors;

public class NiemodyfikowalneCollectory {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.stream().collect(Collectors.toUnmodifiableList());
    }
}
