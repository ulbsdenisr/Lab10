package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creating a list of 5 Romanian persons
        List<Persoana> persoane = new ArrayList<>();
        persoane.add(new Persoana("Pop", "Ion", 28));
        persoane.add(new Persoana("Ionescu", "Maria", 35));
        persoane.add(new Persoana("Dumitrescu", "Andrei", 22));
        persoane.add(new Persoana("Popa", "Elena", 42));
        persoane.add(new Persoana("Stan", "Mihai", 28));

        for (Persoana p : persoane) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Pb 1:");
        persoane.stream()
                .map(persoana -> persoana.getNume())
                .filter(nume -> nume.length() <= 4)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Pb 2:");
        persoane.stream()
                .map(persoana -> persoana.getNume() + " -> " + persoana.getNume().length())
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Pb 3:");
        String numeConcatenate = persoane.stream()
                .map(persoana -> persoana.getNume())
                .reduce("", (accumulated, nume) ->
                        accumulated.isEmpty() ? nume : accumulated + ", " + nume);
        System.out.println(numeConcatenate);
        System.out.println();

        System.out.println("Pb 4:");
        String numeLowercase = persoane.stream()
                .map(persoana -> persoana.getNume().toLowerCase())
                .filter(nume -> nume.length() >= 4)
                .reduce("", (accumulated, nume) ->
                        accumulated.isEmpty() ? nume : accumulated + " " + nume);
        System.out.println(numeLowercase);
        System.out.println();
    }
}
