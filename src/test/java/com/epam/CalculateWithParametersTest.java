package com.epam;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class CalculateWithParametersTest extends CalculateBaseMethods  {

    Calculate calculate = new Calculate();

    @Test
    @Parameters(value = {"number"})
    public void squareEquilateralTriangleTestWithParam (@Optional("2") int number) {
        Assert.assertEquals(calculate.squareEquilateralTriangle(number), 8.0);
    }
}
