package testing;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class MealTest {

    @Test
    void shouldReturnDiscountedPrice() {

        //given
        Meal meal = new Meal(100);

        //when
        int discountedPrice = meal.getDiscountedPrice(35);

        //then
        assertEquals(65, discountedPrice);          // this is an example of difference between
        assertThat(discountedPrice, equalTo(65));   // properties in assertEquals & assertThat
    }

    @Test //referential comparison
    void referenceToTheSameObjkectShouldBeEqual() {

        //given
        Meal meal = new Meal(100);
        Meal meal2 = meal;
        Meal meal3 = new Meal(100);

        //then
        assertSame(meal,meal2); // this should pass
//        assertSame(meal,meal3); // this should not pass
        assertThat(meal, is(sameInstance(meal2)));  // need a comment?

    }
    @Test
    void twoMealsShouldBeEqualsWhenPriceAndNameAreTheSame() {

        //given
        Meal meal = new Meal(100, "pizza");
        Meal meal2 = new Meal(100, "pizza");
        Meal meal3 = new Meal(100, "hot dog");

        //then
/**
* this is a referential comparison, so it will not pass, because all 3 meals are different objects
*/
//        assertSame(meal,meal2); // this should not pass
//        assertSame(meal,meal3); // this should not pass

        
/**
 *  this will not work until you overwrite equals & hashcode in main class (Meal.java) using default Inteliji Template
 */
        assertEquals(meal, meal2);
//        assertEquals(meal, meal3, "price or name is not the same");

    }



}