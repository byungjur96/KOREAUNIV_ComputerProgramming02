package 실습_14;

/**
 * Created by byungjuchae on 2016. 12. 7..
 */
public class Test {
    public static void main(String [] args) {
        IntTree x = new IntTree(5);
        x.add(new IntTree(3));
        x.add(new IntTree(2));
        x.add(new IntTree(4));
        x.add(new IntTree(8));
        x.add(new IntTree(9));
        x.print(System.out);
    }
}
