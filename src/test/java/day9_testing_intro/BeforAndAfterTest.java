package day9_testing_intro;


import sun.jvm.hotspot.utilities.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;

public class BeforAndAfterTest {

    @BeforeClass
    public void beforeClass(){
        System.out.println("\tBEFORE CLASS");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("\tAFTER CLASS");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\tBEFORE METHOD");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("\tAFTER METHOD");
    }
    @Test
    public void test1(){
        System.out.println("this is test one");
//        Assert.assertEquals(true, false);
    }
    @Test
    public void test2(){
        System.out.println("this is test two");
    }
}





