public class Crocodile extends Animal implements Comparable<Crocodile>{
    double length;

    public Crocodile(double weight, double length) {
        super(weight);
        this.length = length;
    }

    public Crocodile(double weight) {
        super(weight);
    }


    public int compareTo(Crocodile o) {
        if(Double.compare(this.getWeight(), o.getWeight())==0)
            return Double.compare(this.length, o.length);
        else
            return Double.compare(this.getWeight(), o.getWeight());
    }

    /*@Override
    public int compareTo(Object o) {
        if(!(o instanceof Crocodile))
            return 1;
        else
            return compareTo((Crocodile) o);
    }*/

    @Override
    public String toString() {
        return "Crocodile{weight=" +getWeight()+" "+
                "length=" + length +
                '}';
    }
}
