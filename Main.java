import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter size of the random list: ");
        // int size = scan.nextInt();
        // List<Integer> rand_list = su.random_list_integers(size);
        // System.out.println("Random List: " + rand_list);

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 4, 4, 3, 3, 3));
        Map<Integer, Integer> test = su.mapOccurrences(list);
        System.out.println("Occurences: " + test);
    }
}
