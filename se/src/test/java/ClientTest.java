import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lywar on 09.08.2017.
 */
public class ClientTest {
    @Test
    public void equals() throws Exception {
        Client client = new Client("Danil",new Cat("elis"));
        assertEquals(client, client);
    }
    @Test
    public void equalsTest() throws Exception {
        Client client = new Client("Danil",new Cat("elis"));
        Client client2 = new Client("Danil",new Cat("elis"));
        assertEquals(client, client2);
    }

}