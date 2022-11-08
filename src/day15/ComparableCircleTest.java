package day15;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(53413413412.2);
        ComparableCircle c2 = new ComparableCircle(62132132131.1);
        int compareValue = c1.compareTo(c2);
        if (compareValue > 0){
            System.out.println("c1 > c2");
        }else if (compareValue < 0){
            System.out.println("c1 < c2");
        }else {
            System.out.println("c1 = c2");
        }
    }
}

