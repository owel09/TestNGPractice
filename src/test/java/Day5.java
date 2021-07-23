import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
Section 20 - Parameterizing Test Cases - using TestNG xml
gamit yung xml file, i-papasa natin yung values papunta sa test case natin
via XML file lang ang pang RUN dito
 */

public class Day5 {

    @Parameters({"URL","APIKey"})
    @Test
    public void medicalLoan(String urladdress, String key){
        System.out.println("medicalLoan page");
        System.out.println(urladdress);
        System.out.println(key);
    }
}
