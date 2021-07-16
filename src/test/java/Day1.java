import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 *Created by owel on 08/07/2021 2:28 PM
 */
public class Day1 {


    @Test
    public void firstTC(){
        System.out.println("hello");
    }

    @Test
    public void secondTC(){
        System.out.println("bye");
    }

    @BeforeTest
    public void prerequisite(){
        System.out.println("i will execute first");
    }

    @AfterTest
    public void lastExec(){
        System.out.println("i will execute last");
    }

    @BeforeSuite
    public void firstSuite(){
        System.out.println("Im the number 1");
    }

    @Test(groups = {"Smoke"})
    public void smokeDay1(){
        System.out.println("smoke test in Day 1");
    }
}
