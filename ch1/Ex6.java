package com.netcracker.ch1;

import java.math.BigInteger;

public class Ex6 {
    public static BigInteger factorial(int n) {

        BigInteger result = BigInteger.valueOf(1);

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}
