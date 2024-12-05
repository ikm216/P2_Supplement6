import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of the random list: ");
        int size = scan.nextInt();
        List<Integer> rand_list = su.random_list_integers(size);
        System.out.println("Random List: " + rand_list);
    }
}
