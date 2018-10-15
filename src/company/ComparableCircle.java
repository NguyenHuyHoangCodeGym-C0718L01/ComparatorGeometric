package company;
public class ComparableCircle extends Circle implements IComparator<ComparableCircle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compare(ComparableCircle t1, ComparableCircle t2) {
        if(t1.getRadius() > t2.getRadius()){
            return 2;
        }

        return 1;
    }
}
