package com.bilgeadam.boost.praticemyself.BoxMatch;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike", 22, 100, 75,25,35,40);
        Fighter f2 = new Fighter("Johny", 25, 120, 80,25,20,35);

        Match match = new Match(f1, f2, 100, 70);
        match.run();
    }
}
