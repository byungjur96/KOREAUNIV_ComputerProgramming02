package 실습_14;

/**
 * Created by byungjuchae on 2016. 12. 7..
 */
public class TestObject {
    public static void main(String [] args) {
        Object x = new Object();
        Class y = x.getClass();



        System.out.println(x.getClass());
        System.out.println(x.getClass().getName());
    }
}