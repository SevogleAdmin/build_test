package ex.project;

import org.junit.Assert;
import org.junit.Test;

import ex.project.Foobar;

public class FoobarTest {
    @Test
    public void testFoobar() throws Exception {
        Foobar fb = new Foobar();
        Assert.assertEquals("foobar text", fb.getText());
    }
}
