package com.epam;


public class Calculate {

    public boolean isEquilateralTriangle (int a, int b, int c)
    {
        if (a == 0 || b == 0 || c ==0) {
            return false;
        }
        return a == b && b == c;
    }

    public double squareEquilateralTriangle (int a)
    {
        return Math.pow(3, a);
    }

}

