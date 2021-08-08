package vkurman.greencorner;

import org.junit.Test;

import vkurman.greencorner.model.Fruit;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class FruitUnitTest {
    @Test
    public void name_isCorrect() {
        Fruit pear = new Fruit("Pear", "Conference");

        assertEquals("Pear", pear.getName());
    }
}