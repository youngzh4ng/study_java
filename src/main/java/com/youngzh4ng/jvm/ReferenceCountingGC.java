package com.youngzh4ng.jvm;

public class ReferenceCountingGC {
    public Object instance = null;

    private static final int I_1_M = 1024*1024;
    private byte[] bigSize = new byte[2 * I_1_M];

    public static void main(String[] args) {
        ReferenceCountingGC rA = new ReferenceCountingGC();
        ReferenceCountingGC rB = new ReferenceCountingGC();
        rA.instance = rB;
        rB.instance = rA;

        rA = null;
        rB = null;
        System.gc();
    }

}
