package org.softpost;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
    @Test(groups = {"sanity","smoke"})
    public static void test1(){
        System.out.println("Test1");
    }

    @Test
    public static void test2(){
        System.out.println("Test2");
    }
}
