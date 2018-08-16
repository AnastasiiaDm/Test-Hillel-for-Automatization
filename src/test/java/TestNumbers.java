import java.util.Arrays;

public class TestNumbers {
    public static void main(String[] args) {

        int[] num = {4, 1, 9, 2, 5};
        System.out.println("Initial numbers: " + Arrays.toString(num));

        Arrays.sort(num);
        System.out.println("Sorted order: " + Arrays.toString(num));
    }
}
