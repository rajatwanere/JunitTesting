import org.junit.Assert;
import org.junit.Test;

public class JunitTest {
    @Test
    public void testMaxValue(){
        JunitExample junit=new JunitExample();
        Assert.assertEquals(5,junit.maxValue(new int[]{1,2,3,4,5}));
        //junit.maxValue(new int[]{1,2,3,4,5});
    }

}
