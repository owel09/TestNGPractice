import org.testng.annotations.Test;

/*
 *Created by owel on 08/07/2021 3:38 PM
 */
public class Day2 {

    @Test(timeOut = 4000) //hindi sya magfafail hanggang di natatapos yung 4000 millisecond or 4 seconds
    public void ploan(){
        System.out.println("good");
    }

    @Test(groups = {"Smoke"})
    public void smokeDay2(){
        System.out.println("smoke test in Day 2");
    }

}
