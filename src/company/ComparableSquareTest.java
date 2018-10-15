package company;

import java.util.Arrays;

public class ComparableSquareTest {
    public static void main(String[] args){
        ComparableSquare[] list = new ComparableSquare[3];
        list[0] = new ComparableSquare(4);
        list[1] = new ComparableSquare();
        list[2] = new ComparableSquare(3);

        for(int i = 0; i <  list.length-1; i++){
            if(list[i].compare(list[i], list[i+1])==2){
                ComparableSquare temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
            }

        }

        for(ComparableSquare i : list){
            System.out.println(i.getWidth());
        }

        double[] squares = new double[3];
        squares[0] = new ComparableSquare().getWidth();
        squares[1] = new ComparableSquare(4).getLength();
        squares[2] = new ComparableSquare(3).getLength();

        Arrays.sort(squares);

        for(double comparableCircle : squares){
            System.out.println(comparableCircle);
        }
    }
}
