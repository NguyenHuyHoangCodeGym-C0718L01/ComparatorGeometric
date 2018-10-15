package company;

import java.util.Arrays;

public class ComparableRectangleTest {
    public static void main(String[] args){
        ComparableRectangle[] list = new ComparableRectangle[3];
        list[0] = new ComparableRectangle(1,2);
        list[1] = new ComparableRectangle();
        list[2] = new ComparableRectangle(2,3);

        for(int i = 0; i <  list.length-1; i++){
            if(list[i].compare(list[i], list[i+1])==2){
                ComparableRectangle temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
            }

        }

        for(ComparableRectangle i : list){
            System.out.println(i.getArea());
        }

        double[] rectangles = new double[3];
        rectangles[0] = new ComparableRectangle().getArea();
        rectangles[1] = new ComparableRectangle(2,3).getArea();
        rectangles[2] = new ComparableRectangle(1,2).getArea();

        Arrays.sort(rectangles);

        for(double comparableCircle : rectangles){
            System.out.println(comparableCircle);
        }
    }
}
