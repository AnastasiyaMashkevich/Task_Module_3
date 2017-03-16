package com.epam;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class CalculateDependsOnMethodTest extends CalculateBaseMethods  {

    private Calculate calculate = new Calculate();

    @Test
    public void isEquilateralTriangleTest () {

        Assert.assertTrue(calculate.isEquilateralTriangle(3, 3, 3));
    }

  @Test (dependsOnMethods = {"isEquilateralTriangleTest"})
    public void squareEquilateralTriangleTest () {
        Assert.assertEquals(calculate.squareEquilateralTriangle(3),27.0);
    }

}
