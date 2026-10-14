import java.util.Arrays;
public class ArrayFundamentals {
    public static int changeFirst(int[] values) {
        values[0] = 99;
        return values[0];
    }
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int[] values = {10, 20, 30};
        numbers[0] = 7;
        numbers[1] = 14;
        System.out.println("Initialized array: " + Arrays.toString(numbers));
        System.out.println("First value: " + values[0]);
        for (int i = 0; i < values.length; i++) {
            System.out.println("Index " + i + ": " + values[i]);
        }
        values[1] = 25;
        System.out.println("Modified array: " + Arrays.toString(values));
        changeFirst(values);
        System.out.println("After method call: " + Arrays.toString(values));
        System.out.println("Length: " + values.length);
    }
}