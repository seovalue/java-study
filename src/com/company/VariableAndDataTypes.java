package com.company;

import java.math.BigDecimal;

public class VariableAndDataTypes {

    public static void main(String[] args) {
	    // float 을 이용해서 0.1을 10번 더했을 때 어떤 값이 나오는지 확인해보자.
        float floatValue = 0.0f;
        for(int i = 0; i < 10; i++){
            floatValue += 0.1f;
        }
        System.out.println(floatValue);
        // 출력 결과, 1.0000001 이 나온다.
        // float 타입으로 값을 계산하면 부동소수점으로 인해 정확한 결과를 얻기 어려울 수 있다.

        BigDecimal b = BigDecimal.ZERO;
        for(int i = 0; i < 10; i++){
            b = b.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(b);
        // 이럴 때, BigDecimal을 사용하면 정확한 결과를 얻을 수 있다.
    }

}
