import org.testng.Assert;
import org.testng.annotations.Test;

public class Day7 {

    @Test
    public void PassedTC(){
        System.out.println("You passed");
        Assert.assertTrue(true);
    }

    @Test
    public void FailTC(){
        System.out.println("You failed");
        Assert.assertTrue(false); //sadyang magfafail ito para makita ko kung magpprint yung FAILED galing sa Listener
    }
}
