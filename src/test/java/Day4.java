import org.testng.annotations.Test;

/*
 *Created by owel on 08/07/2021 4:53 PM
 */
public class Day4 {

    @Test(enabled = false) //hindi siya mageexecute kapag naka false ito
    public void webHouseLogin(){
        System.out.println("webHouselogin");
    }

    @Test
    public void MobileHouseLogin(){
        System.out.println("mobileHouselogin");
    }

    @Test
    public void APIHouseLogin(){
        System.out.println("apiHouselogin");
    }

    @Test(groups = {"Smoke"})
    public void smokeDay4(){
        System.out.println("smoke test in Day 4");
    }
}
