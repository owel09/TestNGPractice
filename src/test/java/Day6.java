import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
*Section 20 - Parameterizing Test Cases - Data Provider
*gamit yung Data Provider annotation, ipapasa natin yung values sa test case para 3 beses magrun yung test
* sa @Test lagyan mo ng (dataProvider = "getData")
* sa method make sure na may parameter ka ng username, password para icatch yung ibabato ng @DataProvider
* sa @DataProvider gawa ka ng getData method with Object[][] return, storage lang talaga ito
* declare ka ng ka Object 2 dimensional array
* Object[3][2] - 1 param kung ilang beses magrrun, 2 param field na fifillupan
* make sure may return data
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
