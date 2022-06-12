package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * this test is bad, becouse more than one case is tested.
 */
public class AccountTest {

    @Test
    void newAccountShouldNotBeActiveAfterCreation() {
        //given (depend on team preferences can be "given + when" instead of one above another)
        //when
        Acount newAccount = new Acount();

        //then
        assertFalse(newAccount.isActive());

    }

    @Test
    void accountShouldtBeActiveAfterActivation() {
        //given
        Acount newAccount = new Acount();

        //when
        newAccount.setActive(true);

        //then
        assertTrue(newAccount.isActive());
    }
}
