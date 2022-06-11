package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * this test is bad, becouse more than one case is tested.
 * its still ok, to know antipatterns, to not doing it
 */
public class AccountTest {

    /**
     * if assertFalse(newAccount.isActive()); will get 'false', than test will pass. it means, account is not activated.
     * second param is a message, that can be left as a suggestion for future treating this method
     */
    @Test
    void newAccountShouldNotBeActiveAfterCreation() {
        //given (depend on team preferences can be "given + when" instead of one above another)
        //when
        Acount newAccount = new Acount();

        //then
        assertFalse(newAccount.isActive(), "check if new account is active" );

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
