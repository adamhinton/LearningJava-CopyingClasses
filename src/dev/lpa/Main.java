package dev.lpa;

record Person(String name, String dob){}

public class Main {
    public static void main(String[] args) {

        Person joe = new Person ("Joe", "01/01/1961");
        Person jim = new Person ("Jim", "02/02/1962");
        Person jack = new Person ("Jack", "03/03/1963");
        Person jane = new Person ("Jane", "04/04/1964");
        Person jill = new Person ("Jill", "05/05/1965");

    }
}