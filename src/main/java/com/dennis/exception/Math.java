package com.dennis.exception;

public class Math {

    public static int divide(int tal_1, int tal_2) throws DuKanInteDelaMedNoll{
        if (tal_2 == 0)
            throw new DuKanInteDelaMedNoll("för helvete");
        return tal_1/tal_2;
    }
}
