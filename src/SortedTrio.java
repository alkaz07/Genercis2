public class SortedTrio <E extends Animal>{
    private E x=null;
    private E y=null;
    private E z=null;

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void put(E newItem){
        switch (count){
            case 0:
                x = newItem;
                break;
            case 1:
                if(newItem.getWeight() > x.getWeight())
                    y = newItem;
                else {
                    y = x;
                    x= newItem;
                }
                break;
            case 2:
                if(newItem.getWeight() > y.getWeight())
                    z=newItem;
                else{
                    if(newItem.getWeight()> x.getWeight())
                    {
                        z=y;
                        y=newItem;
                    }
                    else {
                        z=y;
                        y=x;
                        x=newItem;
                    }
                }
                break;
            default:
                count--;
        }
        count++;
    }

    @Override
    public String toString() {
        return "SortedTrio{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
