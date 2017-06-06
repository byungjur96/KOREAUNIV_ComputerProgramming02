package 실습_8;

import java.util.Scanner;

/**
 * Created by byungjuchae on 2016. 10. 19..
 */
public class Lab08_3_2 {
    public static void main(String[] args){
        int size;//matrix 크기

        //matrix 크기 지정 및 변수 설정
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        size=input.nextInt();
        int[][] table = new int[size][size]; //기본 matrix
        int[][] sum = new int[size][size]; //sum matrix
        int [] result =  {0,0,0};


        //기본 matrix 입력
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = input.nextInt();
            }
        }

        //sum matrix 입력
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                for(int x=i; x<=j; x++){
                    for(int y=i; y<=j; y++){
                        sum[i][j]+=table[x][y];
                    }
                }
            }
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

        //하나씩 확인
       for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(sum[i][j]==(j-i+1)*(j-i+1) && (j-i+1)>result[0]){
                    result[0]=(j-i+1);
                    result[1]=i;
                    result[2]=j;
                }
            }
        }
        System.out.printf("The maximum square submatrix is at (%d, %d) with size %d",result[1],result[2],result[0]);

    }
}
