package HW1.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserch {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<String> resultAgeSearch = new ArrayList<>();
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<String> ageSearch() {
        System.out.print("Ограничение по возрасту: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.println("Список людей,которые младше " + age + ":");

        for (Node t : tree) {

            if (t.p1.age <= age && !resultAgeSearch.contains(t.p1.fullName)) {
                resultAgeSearch.add(t.p1.fullName);
            }
        }
        return resultAgeSearch;
    }
}
