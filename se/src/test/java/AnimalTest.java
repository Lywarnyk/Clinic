import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lywar on 09.08.2017.
 */
public class AnimalTest {
    @Test
    public void AnimalEqualsTest(){
        Pet pet = new Dog("Jessy");
        Pet pet2 = new Dog("Jessy");
        assertEquals(pet, pet2);
    }

    @Test
    public void AnimalEqualsReflexiveTest(){
        Pet pet = new Dog("Jessy");

        assertEquals(pet, pet);
    }

}