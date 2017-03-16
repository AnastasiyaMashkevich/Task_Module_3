package com.epam;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class CalculateDataProviderTest extends CalculateBaseMethods {

    private Calculate calculate = new Calculate();

    @DataProvider (name = "DataProviderForMethodIsEquilateralTriangleTest")
    public Object [] [] paramForCalculateTest ()
    {
        return new Object[][]{
                {3, 3, 3, true},
                {5, 6, 7, false},
                {10, 10, 0, false},
        };
    }

    @Test (dataProvider = "DataProviderForMethodIsEquilateralTriangleTest")
    public void isIsEquilateralTriangleTest (int a, int b, int c, boolean result)
    {
        Assert.assertEquals(calculate.isEquilateralTriangle(a, b, c), result);
    }

    @DataProvider (name = "DataProviderForMethodSquareEquilateralTriangleTest")
    public Object [] [] paramForCalculateTestTwo ()
    {
        return new Object[][]{
                {3, 27.0},
                {2, 8.0},
        };
    }

    @Test (dataProvider = "DataProviderForMethodSquareEquilateralTriangleTest")
    public void isIsEquilateralTriangleTestTwo (int a, double result)
    {
        Assert.assertEquals(calculate.squareEquilateralTriangle(a), result);
    }


}
