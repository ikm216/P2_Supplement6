import java.util.*;

public class su{
    /**
 * Generates a random list of integers using a size.
 *
 * @param size The size of the random list to generate.
 * @return A list of random integers.
 */
    public static List<Integer> random_list_integers(int size){
        Random rand = new Random();
        List<Integer> rand_list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            rand_list.add(rand.nextInt(100));
        }

        return rand_list;
    }
}