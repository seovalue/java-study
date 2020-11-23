package test;

/*1 2 3      7 8 9
4 5 6  ->  1 2 3
7 8 9      4 5 6
3행이 1행으로, 1행이 2행으로, 2행이 3행으로 한 줄씩 내려가는 것을 구현!*/
public class TwoDimArrTest2 {
    public static void shiftArr(int[][] arr){
        int[] lastRow = arr[arr.length-1];

        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = lastRow;
    }

    public static void showArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        shiftArr(arr);
        showArr(arr);
    }
}
