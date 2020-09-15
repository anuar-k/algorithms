import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //создаем массив
        int[] arr = {10, 1, 0, 4, 2, 9};
        //выводим неотсотированный массив
        System.out.println(Arrays.toString(arr));
        int first;
        int second;
        int min;
        for (first = 0; first < arr.length; first++) {
            //указываем что first элемент минимальный
            min = first;
            //сравниваем минимальный элемент в цикле
            for (second = first + 1; second < arr.length; second++) {
                if (arr[second] < arr[min])
                    min = second;
            }
            // поменять местами минимальные значения (новое со старым)
            int temp = arr[first];
            arr[first] = arr[min];
            arr[min] = temp;
        }
        //выводим отсотированный массив
        System.out.println(Arrays.toString(arr));
    }
}