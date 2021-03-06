package com.prometheus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {

         List <Osoba> osoby = Arrays.asList(
                new Osoba("Martin", "Bugar", 25),
                 new Osoba("Matej", "Bugar", 26),
                 new Osoba("Marian", "Bugar", 27),
                new Osoba("Martyx", "Jcodes", 2),
                new Osoba("Karol", "Velky", 24),
                new Osoba("Fridrich", "Cudny", 55)
        );

//         osoby.stream()
//                 .filter(osoba -> osoba.getVek() < 50)
//                 .forEach(System.out::println);
//
//       long pocet =  osoby.stream()
//                .filter(osoba -> osoba.getVek() < 50)
//                .count();
//
//        System.out.println(pocet);

//        List <Integer> veky = osoby.stream()
//                .filter(osoba -> osoba.getVek() < 50) // filter vracia boolean, ak je osoba menej ako 50 rokov tak prejde
//                .sorted(Comparator.comparing(Osoba::getVek)) // zoberie vek kazdej osoby do radu a zosortuje ho
//                .map(Osoba::getVek) // spravi sa mi novy stream integerov (uz nie objektov osoba)
//                .collect(Collectors.toList()); // ukoncovaci kod + ulozi mi do listu (vraci list <integer> vek)
//
//        veky.forEach(System.out::println); // vypisinanie listu veky cez method referenciu

        //toto spadne ak bude ta prva osoba null
        osoby.stream().findFirst().ifPresent(System.out::println); //zo streamu vrati prvy objekt, a ak tam je (cely objekt osoba) tak sa vypise

        //premapujeme si objekt osoba na typ Optional<Osoba> a uz to moze byt aj null a nespadne to
        osoby.stream().map(osoba -> Optional.of(osoba)).findFirst().ifPresent(System.out::println);



    }

}
