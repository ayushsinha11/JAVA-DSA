package Arrays;
import java.awt.font.FontRenderContext;
import java.util.*;
import java.util.Scanner;

public class twodarrayinput {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int row=in.nextInt();
        int col=in.nextInt();
        //ARRAY CREATION:
        int [][] arr=new int[row][col];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
              arr[i][j]=in.nextInt();
        }
//OUTPUT USING ENHANCED FOR LOOP
        for (int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }
//OUTPUT USING ARRAYS.TOSTRING
//        for (int i=0;i<row;i++)
//        {
//          //  for (int j=0;j<col;j++)
//                System.out.println((Arrays.toString(arr[i])));
//        }
// OUTPUT USING FOR LOOP
//        for (int i=0;i<row;i++)
//        {
//            for (int j=0;j<col;j++){
//
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

    }
}
