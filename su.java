import java.util.*;

public class su{
    public static List<Integer> random_list_integers(int size){
        Random rand = new Random();
        List<Integer> rand_list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            rand_list.add(rand.nextInt(100));
        }

        return rand_list;
    }
}