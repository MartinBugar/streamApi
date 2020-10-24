package com.prometheus;

import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {

         List <Osoba> osoby = Arrays.asList(
                new Osoba("Martin", "Bugar", 25),
                new Osoba("Martyx", "Jcodes", 2),
                new Osoba("Karol", "Velky", 24),
                new Osoba("Fridrich", "Cudny", 55)
        );

         osoby.stream()
                 .filter(osoba -> osoba.getVek() < 50)
                 .forEach(System.out::println);

    }
}
