import java.util.*;
import org.junit.*;
import org.junit.jupiter.api.TestFactory;

public class test_java {
    @Test
    public void test_should_return_a_random_list_integers(){
        int size = 8;
        List<Integer> test = su.random_list_integers(size);
        Assert.assertEquals(size, test.size());
    }

    @Test
    public void test_should_return_a_map_of_occurences(){
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 4, 4, 3, 3, 3));
        Map<Integer, Integer> test = su.mapOccurrences(list);
        Assert.assertEquals(2, (int) test.get(2));
        Assert.assertEquals(4, (int) test.get(4));
        Assert.assertEquals(3, (int) test.get(3));
    }
}
