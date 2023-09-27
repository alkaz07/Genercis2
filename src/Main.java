import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       // exempleElephants();
       // exempleCrocodiles();
        //exempleCrocTreeSet();
       // exempleElephantTreeSet();// מרטבךא. םו סנאגםטגאולûו סכמםû
        exempleElephantHashSet();
    }

    private static void exempleElephantHashSet() {
        Elephant e1 = new Elephant("aaaa", 45, 400);
        Elephant e2 = new Elephant("בבב", 56, 350);
        Elephant e3 = new Elephant("גגג", 66, 420);
        HashSet<Elephant> set3 = new HashSet<>();
        set3.add(e1);
        set3.add(e2);
        set3.add(e3);
        System.out.println(set3);
        set3.add(new Elephant("eee", 56, 200));
        System.out.println(set3);
        set3.add(new Elephant("eee", 56, 200));
        System.out.println(set3);
    }

    private static void exempleCrocTreeSet() {
        Crocodile c1 = new Crocodile(200, 50);
        Crocodile c2 = new Crocodile(200, 45);
        Crocodile c3 = new Crocodile(150, 51);
        TreeSet<Crocodile> set1 = new TreeSet<>();
        set1.add(c1);
        set1.add(c2);
        set1.add(c3);
        System.out.println(set1);
        set1.add(new Crocodile(200, 30));
        System.out.println(set1);

    }

    private static void exempleElephantTreeSet() {
        Elephant e1 = new Elephant("aaaa", 45, 400);
        Elephant e2 = new Elephant("בבב", 56, 350);
        Elephant e3 = new Elephant("גגג", 66, 420);
        TreeSet<Elephant> set2 = new TreeSet<>();
        set2.add(e1);
        set2.add(e2);
        set2.add(e3);
        System.out.println(set2);
        set2.add(new Elephant("eee", 56, 200));
        System.out.println(set2);

    }

    private static void exempleCrocodiles() {
        Crocodile c1 = new Crocodile(200, 50);
        Crocodile c2 = new Crocodile(200, 45);
        Crocodile c3 = new Crocodile(150, 51);
        ArrayList<Crocodile> crocodiles = new ArrayList<>();
        crocodiles.add(c1);crocodiles.add(c2);crocodiles.add(c3);
        crocodiles.sort(null);
        System.out.println(crocodiles);


    }

    private static void exempleElephants() {
        Elephant e1 = new Elephant("aaaa", 45, 400);
        Elephant e2 = new Elephant("בבב", 56, 350);
        Elephant e3 = new Elephant("גגג", 66, 420);

        SortedTrio<Elephant> elephantSortedTrio = new SortedTrio<>();
        elephantSortedTrio.put(e1);
        elephantSortedTrio.put(e2);
        elephantSortedTrio.put(e3);
        System.out.println(elephantSortedTrio);

        LinkedList<Elephant> elephants = new LinkedList<>();
        elephants.add(e1);
        elephants.add(e2);
        elephants.add(e3);
        elephants.sort((o1, o2) -> Double.compare(o1.getWeight(), o2.getWeight()));
        System.out.println(elephants);
        elephants.sort((left, right)->Double.compare(left.age, right.age));
        System.out.println(elephants);
        elephants.sort((left, right)->Double.compare(left.age*10+left.getWeight(),
                                                    right.age*10+right.getWeight()));
        System.out.println(elephants);

        elephants.add(new Elephant("דדד", 56, 300));
        elephants.sort((l, r)-> {
            if(Double.compare(l.age, r.age) == 0)
                return Double.compare(l.getWeight(), r.getWeight());
            else
                return Double.compare(l.age, r.age);
        });
        System.out.println(elephants);

        elephants.add(new Elephant("הההה",45, 410));
        elephants.sort(new ElComparator());
        System.out.println(elephants);
    }
}

