package testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AccountTest {

    /**
     * if assertFalse(newAccount.isActive()); will get 'false', than test will pass. it means, account is not activated.
     * second param is a message, that can be left as a suggestion for future treating this method
     */
    @Test
    void myTest() {

        Acount newAccount = new Acount();
        assertFalse(newAccount.isActive(), "check if new account is active" );

    }

    @Test
    void myTest2() {

        Acount newAccount = new Acount();
        assertFalse(newAccount.isActive());
        newAccount.setActive(true);
        assertTrue(newAccount.isActive());
    }
}
