import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
Section 20 - Parameterizing Test Cases - Data Provider
gamit yung Data Provider annotation, ipapasa natin yung values sa test case
*/
public class Day6 {

    @Test(dataProvider = "getData")
    public void ps4SignIn(String username, String password){
        System.out.println("Welcome to PS4");
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[3][2];

        data[0][0] = "firstSetUsername";
        data[0][1] = "firstSetPassword";

        data[1][0] = "secondSetUsername";
        data[1][1] = "secondSetPassword";

        data[2][0] = "thirdSetUsername";
        data[2][1] = "thirdSetPassword";
        return data;
    }
}
