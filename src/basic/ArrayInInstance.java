package basic;

class ArrayInInstance{
    public static void main(String[] args){
        int[] arr = new int[5]; //길이가 5인 배열 생성
        double[] arr2 = new double[5]; //길이가 5인 double형 배열 생성

        float[] arr3;
        arr3 = new float[3];

        System.out.println("배열 arr1의 길이 "+arr.length);
        System.out.println("배열 arr2의 길이 "+arr2.length);
        System.out.println("배열 arr3의 길이 "+arr3.length);
    }
}
