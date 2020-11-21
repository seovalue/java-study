package com.company;

public class Recursive {
    // 재귀 함수를 정의해보자
    public static void main(String[] args){
        System.out.println("3 factorial: "+ factorial(3));
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        } else{
            return n * factorial(n-1);
        }
    }
}
