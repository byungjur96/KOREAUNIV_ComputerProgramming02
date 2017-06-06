package 실습_0;

/**
 * Created by byungjuchae on 2016. 12. 17..
 */
public class HW_2 {
    int method_1(int x) {
        int result=1;
        for(int i=x; i>0; i--){
            result*=i;
        }
        return result;
    }
    int method_2(int x) {
        return x*(x+1)*(2*x+1)/6;
    }
    int method_3(int x) {
        int count=0;
        for (int i=1; i<=x; i++){
            if(x%i==0){
                count++;
            }
        }
        if (count==2){
            return 1;
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        HW_2 obj = new HW_2();
        System.out.println("method_1 = " + obj.method_1(12));
        System.out.println("method_2 = " + obj.method_2(255));
        System.out.println("method_3 = " + obj.method_3(977));
    }
}
