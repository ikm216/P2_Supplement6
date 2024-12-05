import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of the random list: ");
        int size = scan.nextInt();
        List<Integer> rand_list = su.random_list_integers(size);
        System.out.println("Random List: " + rand_list);

         List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 2, 4, 4, 4, 4, 3, 3, 3));
         Map<Integer, Integer> test1 = su.mapOccurrences(list1);
         System.out.println("Occurences: " + test1);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(8, 5, 3, 6));
        List<Integer> test2 = su.sortArr(list2);
        System.out.println("Sorted List: " + test2);

        scan.close();
    }
}
