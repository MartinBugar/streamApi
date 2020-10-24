package com.prometheus;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

 //       basicOptional();
 //       moreOptional();
        orElseOptional();
    }

    private static void orElseOptional() {
        Optional <String> meno = Optional.of("Martin");
        Optional <String> prazdne = Optional.empty();

        System.out.println(meno.orElse("nic")); // vypise hodnotu z mena, ked je meno null tak vypice slovo "nic"
        System.out.println(meno.orElseGet(()->"nic")); //to iste len mozem napisat lampba vyraz

    }

    private static void moreOptional() {
        Optional <String> meno = Optional.of("Martin");
        Optional <String> prazdne = Optional.empty();

        //metoda vrati false ak je meno prazdne a true ak nie je prazdne
//        meno.isPresent();

        //vykona akciu vo vnutri tela ak optional nie je prazdny inak vrati false
//        meno.ifPresent();

        if (meno.isPresent()) {
            System.out.println("meno : " + meno.get());
        }else {
            System.out.println("meno tam nie je");
        }

        meno.ifPresent(m -> System.out.println("meno je " + m)) ;
    }

    private static void basicOptional() {
        Optional<String> meno = Optional.of("Martin");
        String hodnota1 = "daco";
        String hodnota2 = null;

        System.out.println("neprazdnom Optional : " + meno);
        System.out.println("neprazdnom Optional : meno: " + meno.get()); //get vracia hodnotu ktoru drzi premenna meno
        System.out.println("prazdny Optional: " + Optional.empty()); // vytvori prazdny optional

        System.out.println("ofNullable na neprazdnom Optional: " + Optional.ofNullable(hodnota1));
        System.out.println("ofNullable na prazdnom Optional: " + Optional.ofNullable(hodnota2));

        //java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional : " + Optional.of(hodnota2));
    }
}
