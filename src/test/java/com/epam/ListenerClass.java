package com.epam;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.testng.*;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IListeners;


public class ListenerClass implements ITestListener {


    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test is success");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Test is fail");
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onStart(ITestContext context) {
        System.out.println("Test is start");
    }

    public void onFinish(ITestContext context) {
        System.out.println("Test is finish");
    }

}


