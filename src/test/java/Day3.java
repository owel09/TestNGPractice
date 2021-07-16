import org.testng.annotations.*;

/*
 *Created by owel on 08/07/2021 4:53 PM
 */
public class Day3 {

    @BeforeMethod
    public void befMethod(){
        System.out.println("-------before each method-------");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("+++++++after each method+++++++");
    }

    @Parameters({"URL"})
    @Test
    public void webCarLogin(String uName){
        System.out.println("webcarlogin");
        System.out.println(uName);
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


    @Test(groups = {"Smoke"})
    public void smokeDay3(){
        System.out.println("smoke test in Day 3");
    }


}
