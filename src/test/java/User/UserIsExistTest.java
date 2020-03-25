package User;

//import org.graalvm.compiler.lir.LIRInstruction;
import org.junit.Assert;
import org.junit.Test;

public class UserIsExistTest {

    @Test
    public void testIsUserExistWhenUserExist() {

        String [] users = {"Pablo", "Kamil", "Pablo"};

        UserService userService = new UserService(users);

        final boolean result = userService.isUserExist("Kamil");

        Assert.assertTrue(result);
    }

    @Test
    public void testCountExistUsers(){
        String [] users = {"Janek","Pizdeczka","Olaf"};

        UserService newUser = new UserService(users);

        int result = newUser.countUsersExist();

        Assert.assertEquals(3,result);

    }

    @Test

    public void testCounterHowManyExistUser(){
        String [] users = {"Janek", "Wowa", "Pizda", "Janek", "Olaf"};

        UserService userService = new UserService(users);

        int result = userService.countHowManyExistUser("Janek");

        Assert.assertEquals(2,result);

    }

}
