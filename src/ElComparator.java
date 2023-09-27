import java.util.Comparator;

public class ElComparator implements Comparator<Elephant> {

    @Override
    public int compare(Elephant l, Elephant r) {
        if (Double.compare(l.age, r.age) == 0)
            return Double.compare(l.getWeight(), r.getWeight());
        else
            return Double.compare(l.age, r.age);
    }

}
