package com.epam;

import org.testng.*;


public class ListenerClass implements ITestListener {


    public void onTestStart(ITestResult result) {
        System.out.println("Test  /"+ result.getMethod().getMethodName()+"/ is start. " );
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test  /"+ result.getMethod().getMethodName()+"/ is success. " );
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test  /"+ result.getMethod().getMethodName()+"/ is fail. " );
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test finished: " + context.getEndDate());
    }

}


