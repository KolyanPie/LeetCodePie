package ru.kolyanpie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Optional<String>> a = new ArrayList<>();
        a.add(Optional.of("a"));
        a.add(Optional.of("b"));
        a.add(Optional.of("c"));
        a.add(Optional.ofNullable(null));
        a.add(Optional.ofNullable(null));
        System.out.println(a);
        Map<String, List<Optional<String>>> collect = a.stream()
                .collect(Collectors.groupingBy(n -> n.orElse("")));
        System.out.println(collect);
    }
}