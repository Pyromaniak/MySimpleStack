package dcll.lleq;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

    /**
     * Comment
     */
    Item item1 = new Item("pomme");
    Item item2 = new Item("poire");


    @Test
    public void testGetS() throws Exception {
        Assert.assertEquals(item1.getS(), "pomme");
        Assert.assertNotEquals(item1.getS(), "fraise");
    }

    @Test
    public void testSetS() throws Exception {
        item1.setS("fraise");
        Assert.assertEquals(item1.getS(), "fraise");
        Assert.assertNotEquals(item1.getS(), "pomme");
    }

    @Test
    public void testToString() throws Exception {
        Assert.assertEquals(item1.toString(), "dcll.lleq.Item{" +
                "s='" + item1.getS() + '\'' +
                '}');
    }

    @Test
    public void testEquals() throws Exception {

    }

    @Test
    public void testHashCode() throws Exception {

    }
}