import com.beust.jcommander.Parameter;
import org.testng.annotations.*;

/*
 *Created by owel on 08/07/2021 2:28 PM
 */
public class Day1 {


    @BeforeSuite
    public void firstSuite(){
        System.out.println("Im the number 1");
    }

    @BeforeTest
    public void prerequisite(){
        System.out.println("i will execute after the suite");
    }

    @Test
    public void firstTC(){
        System.out.println("hello");
    }


    @Test
    public void secondTC(){
        System.out.println("bye");
    }

    @AfterTest
    public void lastExec(){
        System.out.println("i will execute last");
    }


    @Test(groups = {"Smoke"})
    public void smokeDay1(){
        System.out.println("smoke test in Day 1");
    }

    @Test(dependsOnMethods = "firstTC")
    public void sampleDependsOnMethod(){
        System.out.println("I will run after firstTC runs");
    }

    @AfterSuite
    public void lastMethod(){
        System.out.println("Im triggered last and will display in the end");
    }

}
