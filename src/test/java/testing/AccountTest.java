package testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * this test is bad, becouse more than one case is tested.
 */
public class AccountTest {

    @Test
    void newAccountShouldNotBeActiveAfterCreation() {
        //given (depend on team preferences can be "given + when" instead of one above another)
        //when
        Account newAccount = new Account();

        //then
        assertFalse(newAccount.isActive());                               // this lines
        assertThat(newAccount.isActive(), equalTo(false));       // means the same
        assertThat(newAccount.isActive(), is(false));              // in three ways

    }

    @Test
    void accountShouldBeActiveAfterActivation() {
        //given
        Account newAccount = new Account();

        //when
        newAccount.setActive(true);

        //then
        assertTrue(newAccount.isActive());                           // that two lines
        assertThat(newAccount.isActive(), equalTo(true));   // mean the same
    }

    /**
     * lets try to test if something is null.
     */
    @Test
    void newlyCreatedAccountShouldNotHaveDefaultDeliveryAddress() {
        //given
        Account newAccount = new Account();

        //when
        Address address = newAccount.getDefaultDeliveryAddress();

        //then
        assertNull(address); //siriously Sherlock? :D
        assertThat(address, equalTo(null));
        assertThat(address, nullValue());
        assertThat(address, is(nullValue()));

//        assertNotNull(address); // 2nd point for Sherlock!
//        assertThat(address, notNullValue());

    }

    @Test
    void defaultDeliveryAddressShouldNotBeNullAfterBeingSet() {

        //given
        Address address = new Address("Sharick Straße", "102");
        Account account = new Account();
        account.setDefaultDeliveryAddress(address); //now there should be a not null address

        //when
        Address ddefaultAddress = account.getDefaultDeliveryAddress();

        //then
        assertNotNull(ddefaultAddress);
    }
}
