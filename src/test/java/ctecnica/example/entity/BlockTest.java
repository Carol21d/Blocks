package ctecnica.example.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlockTest {
    /**
     * 
     */
    @Test
    public void testGetId() {
        Block blockId = new Block();
        int result = blockId.getId();
        assertEquals(0, result);

    }

    @Test
    public void testGetWidth() {
        Block blockWidth = new Block();
        int result = blockWidth.getWidth();
        assertEquals(1, result);

    }

    @Test
    public void testGetLength() {
        Block blockLenght = new Block();
        int result = blockLenght.getLength();
        assertEquals(0, result);

    }

    @Test
    public void testGetOrientation() {
        Block blockOrientation = new Block();
        blockOrientation.setOrientation("v");
        String result = blockOrientation.getOrientation();
        assertEquals("v", result);
    }

    @Test
    public void testGetPositionX() {

    }

    @Test
    public void testGetPositionY() {

    }

}
