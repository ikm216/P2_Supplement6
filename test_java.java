import java.util.*;
import org.junit.*;

public class test_java {
    @Test
    public void test_should_return_a_random_list_integers(){
        int size = 8;
        List<Integer> test = su.random_list_integers(size);
        Assert.assertEquals(size, test.size());
    }
}
