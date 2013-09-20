import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class AbeStuffTest {
    @Test
    public void shouldDoAbeStuff(){
        assertNotNull(TestHelper.addHiTo(new AbeStuff().toString()));
    }

}
