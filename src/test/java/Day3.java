import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 *Created by owel on 08/07/2021 4:53 PM
 */
public class Day3 {

    @Test
    public void webCarLogin(){
        System.out.println("webcarlogin");
    }

    @Test
    public void MobileCarLogin(){
        System.out.println("mobilecarlogin");
    }

    @Test
    public void MobileCarSignIn(){
        System.out.println("mobilecarSignIn");
    }

    @Test
    public void MobileCarSignOut(){
        System.out.println("mobilecarSignOut");
    }

    @Test
    public void APICarLogin(){
        System.out.println("apicarlogin");
    }

    @AfterSuite
    public void lastMethod(){
        System.out.println("Im triggered last and will display in the end");
    }

    @BeforeMethod
    public void befMethold(){
        System.out.println("------before each method-------");
    }

    @AfterMethod
    public void AfterMethold(){
        System.out.println("------after each method-------");
    }

    @Test(groups = {"Smoke"})
    public void smokeDay3(){
        System.out.println("smoke test in Day 3");
    }


}
