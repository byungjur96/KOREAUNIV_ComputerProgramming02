package 실습_14;
import java.io.PrintStream;

/**
 * Created by byungjuchae on 2016. 12. 7..
 */

public abstract class Tree {
    protected Tree left, right;
    public Tree() {
        left = null;
        right = null;
    }
    public Tree getLeft() { return left; }
    public Tree getRighth() { return right; }
    public abstract Tree add(Tree node);
    public abstract void print(PrintStream s);
}