package com.prometheus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AkoGenerovatStream {
    public static void main(String[] args) {
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Martin", "Bugar", 25),
                new Osoba("Matej", "Bugar", 26),
                new Osoba("Marian", "Bugar", 27),
                new Osoba("Martyx", "Jcodes", 2),
                new Osoba("Karol", "Velky", 24),
                new Osoba("Fridrich", "Cudny", 55)
        );

        osoby.stream(); //vytvoreny stream osob

        //Arrays.stream();
        Stream.of("string","text"); //stream stringov

        osoby.stream().mapToInt(Osoba::getVek).sum(); // klasicky stream je premapovany na streame integerov a nad tym  je mozne zavolat sum
    }


}
