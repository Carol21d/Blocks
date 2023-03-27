package ctecnica.example.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlockTest {
    @Test
    public void testGetId() {
        Block blockId = new Block();
        int result = blockId.getId();
        assertEquals(0, result);

    }

    @Test
    public void testGetLength() {

        Block blockLength = new Block();
        blockLength.setLength(5);
        int result = blockLength.getLength();
        assertEquals(5, result);

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
        Block blockPosX = new Block();
        blockPosX.setPositionX(2);
        int result = blockPosX.getPositionX();
        assertEquals(2, result);

    }

    @Test
    public void testGetPositionY() {
        Block blockPosY = new Block();
        blockPosY.setPositionY(-2);
        int result = blockPosY.getPositionY();
        assertEquals(-2, result);

    }

    @Test
    public void testGetWidth() {
      Block blockWidth = new Block();
      blockWidth.setWidth(1);
    int result = blockWidth.getWidth();
    assertEquals(1, result);
    }

 
}
