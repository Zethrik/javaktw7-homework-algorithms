package pl.sdacademy.algorithms;

import java.math.BigInteger;

public class LongSum {

    public String sum(Long[] longs) {
        BigInteger bigInteger = new BigInteger("0");

        for (Long aLong : longs) {
            String value = aLong.toString();
            bigInteger = bigInteger.add(new BigInteger(value));
        }

        return bigInteger.toString();
    }
}
