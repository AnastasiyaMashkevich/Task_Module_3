package com.epam;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class CalculateBaseMethods {

    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass() throws Exception {
        System.out.println("@AfterClass");
    }

}
