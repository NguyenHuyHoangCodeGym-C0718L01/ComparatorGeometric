package company;

public class ComparableRectangle extends Rectangle implements IComparator<ComparableRectangle>{

    ComparableRectangle(){}

    ComparableRectangle(double width, double length){
        super(width, length);
    }

    ComparableRectangle(double width, double length, String color, boolean fiiled){
        super(width, length, color, fiiled);
    }

    @Override
    public int compare(ComparableRectangle t1, ComparableRectangle t2) {
        if(t1.getArea() > t2.getArea()){
            return 2;
        }
        return 1;
    }
}
