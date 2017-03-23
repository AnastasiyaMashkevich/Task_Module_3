package com.epam;


public class Calculate {
//new comment
    public boolean isEquilateralTriangle (int a, int b, int c)
    {
        if (a == 0 || b == 0 || c ==0) {
            return false;
        }
        return a == b && b == c;
    }

    public double squareEquilateralTriangle (int a)
    {
        return Math.pow(a, 3);
    }

}

