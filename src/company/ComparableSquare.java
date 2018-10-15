package company;

public class ComparableSquare extends Square implements IComparator<ComparableSquare>{

    public ComparableSquare() {
    }

    public ComparableSquare(double side) {
        super(side);
    }

    public ComparableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public int compare(ComparableSquare t1, ComparableSquare t2) {
        if(t1.getLength() > t2.getLength() || t1.getWidth() > t2.getWidth()){
            return 2;
        }
        return 1;
    }
}
