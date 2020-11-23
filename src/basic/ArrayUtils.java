package basic;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6,7,8,9,10};
        int[] a2 = new int[10];

//        Arrays.fill(a1, 7);
        System.arraycopy(a1, 0, a2, 3, 4);
        //a1의 0 인덱스의 값부터 4번째 인덱스의 값까지를 a2의 3번째 위치부터 복사한다.

        for(int a : a1){
            System.out.print(a + " ");
        }

        System.out.println();
        for(int a: a2){
            System.out.print(a + " ");
        }
    }
}
