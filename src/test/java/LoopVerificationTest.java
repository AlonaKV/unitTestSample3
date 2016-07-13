import org.junit.Assert;
import org.junit.Test;


/**
 * Created by shtrih on 12.07.16.
 */
public class LoopVerificationTest {

    @Test
    public void loop() throws Exception {

        LoopVerification loop = new LoopVerification();
        LoopVerification.CrazzyLoop();

        int[] expectedOutput = {19, 2};
        Assert.assertArrayEquals("Check your code, something wrong",expectedOutput, loop.CrazzyLoop());
    }
}