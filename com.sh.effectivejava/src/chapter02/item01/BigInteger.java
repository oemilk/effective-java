package chapter02.item01;

import java.util.Random;

class BigInteger extends java.math.BigInteger {

    public BigInteger(byte[] val) {
        super(val);
    }

    public BigInteger(int signum, byte[] magnitude) {
        super(signum, magnitude);
    }

    public BigInteger(String val, int radix) {
        super(val, radix);
    }

    public BigInteger(String val) {
        super(val);
    }

    public BigInteger(int numBits, Random rnd) {
        super(numBits, rnd);
    }

    public BigInteger(int bitLength, int certainty, Random rnd) {
        super(bitLength, certainty, rnd);
    }

    public static BigInteger probablePrime(int bitLength, int certainty, Random rnd) {
        return new BigInteger(bitLength, certainty, rnd);
    }

}
