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

    /**
 * Counts the occurrences of each integer in a list.
 *
 * @param list The list of integers.
 * @return A map where the key is the integer, and the value is the number of occurrences.
 */
    public static Map<Integer, Integer> mapOccurrences(List<Integer> list){
        Map<Integer, Integer> occurs = new HashMap<>();
        for(int num: list){
            if(occurs.containsKey(num)){
                occurs.put(num, occurs.get(num) + 1);
            }
            else{
                occurs.put(num, 1);
            }
        }
        return occurs;
    }
    /**
 * Sorts a list of integers in ascending order.
 *
 * @param list The list of integers to sort.
 * @return The sorted list of integers.
 */
    public static List<Integer> sortArr(List<Integer> list){
        List<Integer> sort_list = new ArrayList<>(list);
        Collections.sort(sort_list);

        return sort_list;
    }
}