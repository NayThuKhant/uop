import java.util.Arrays;

public class Main {
    public static final int ARRAY_SIZE = 10000;

    public static void main(String[] args) {
        int[] array1 = new int[ARRAY_SIZE];
        int[] array2 = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array1[i] = (int) (Integer.MAX_VALUE * Math.random());
            array2[i] = (int) (Integer.MAX_VALUE * Math.random());
        }

        long startTime;

        System.out.println("Sorting the first array using InsertionSort .....");
        startTime = System.currentTimeMillis();
        Main.insertionSort(array1);
        System.out.println("Sorting the first array using InsertionSort took " + (System.currentTimeMillis() - startTime) + "ms.");

        System.out.println("Sorting the second array using Arrays.sort() .....");
        startTime = System.currentTimeMillis();
        Arrays.sort(array2);
        System.out.println("Sorting the first array using InsertionSort took " + (System.currentTimeMillis() - startTime) + "ms.");
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < ARRAY_SIZE; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
