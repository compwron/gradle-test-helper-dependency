import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class BarTest {
    @Test
    public void shouldDoStuff(){
        System.out.println("Bar test code depends on Abe test code");
        assertNotNull(TestHelper.addHiTo(new BarStuff().toString()));
    }
}
