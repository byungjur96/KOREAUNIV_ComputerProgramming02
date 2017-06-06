package 실습_8;

import java.util.Scanner;

/**
 * Created by byungjuchae on 2016. 10. 19..
 */
public class Lab08_3 {
    public static int[] findLargestBlock(int[][] m) {
        int [] result = new int[3];
        Scanner input = new Scanner(System.in);
        int m_size = m.length;
        int count=0;
        int x=0, y=0;
        int length, max_length;

        result[2]=1;
        //matrix 만들기
        System.out.println("Enter the matrix row by row: ");

        for (int i = 0; i < m_size; i++) {
            for (int j = 0; j < m_size; j++) {
                m[i][j] = input.nextInt();
            }
        }

        //검사
            //하나하나 돌아가기
        for(x=0; x<m_size ;x++){
            for(y=0; y<m_size ;y++) {

                //더 긴 쪽 찾기
                if (x >= y)
                    max_length = m_size - x;
                else
                    max_length = m_size - y;


                for (length = 1; length <= max_length; length++) {
                    for (int i = x; i < x + length; i++) {
                        for (int j = y; j < y + length; j++) {
                            if (m[i][j] == 1) {
                                count++;
                            }
                        }
                    }
                    if (count == length * length) {
                        if (length > result[2]) {
                            result[2] = length;
                            result[0] = x;
                            result[1] = y;
                        }
                    }
                    count = 0;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args){
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        size=input.nextInt();
        int[][] table = new int[size][size];
        int[] result;
        result=findLargestBlock(table);
        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d",result[0],result[1],result[2]);
    }
}
