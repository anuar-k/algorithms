import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //создаем массив
        int[] arr = {10, 1, 0, 4, 2, 9};
        //выводим неотсотированный массив
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // сравниваем значения элементов между собой
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        //выводим отсотированный массив
        System.out.println(Arrays.toString(arr));
    }
}