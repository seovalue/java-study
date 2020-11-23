package test;

public class TwoDimArrTest1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        arr = addOneDArr(arr, 3);
        int[][] arr2 = {{1,2},{3,4}};
        arr2 = addTwoDArr(arr2, 3);

        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println();

        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

   /* for-each문을 사용하게 되면 배열의 값이 변하지 않게 된다.
    for-each문의 변수인 a는 for-each문의 내부에서만 변경되기 때문이다.
    따라서 for문을 사용하여 배열의 참조값을 변경시켜줘야 실제 값이 변경된다.*/
    public static int[] addOneDArr(int[] arr, int add){
        for(int a: arr){
            a += add;
        }
//        for(int i = 0; i < arr.length; i++){
//            arr[i] += add;
//        }

        return arr;
    }

    public static int[][] addTwoDArr(int[][] arr, int add){
        for(int[] a : arr){
            addOneDArr(a, add);
        }

        return arr;
    }
}
