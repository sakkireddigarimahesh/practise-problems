import java.util.Arrays;

public class check {
    public static void main(String[] args) {
    int[] arrayOne = {1,2,3,4};
    int[] arrayTwo = {1,2,3,4};
    if (Arrays.equals(arrayOne, arrayTwo)) {
        System.out.println("Arrays are equal");
    } else {
        System.out.println("Arrays are not equal");
    }
}
}
