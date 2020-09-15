import java.util.Arrays;

public class QuickSort {
    //создаем массив
    static int[] arr = {10, 1, 0, 4, 2, 9};

    public static void main(String[] args) {
        //выводим неотсотированный массив
        System.out.println(Arrays.toString(arr));
        //вызываем статический метод быстрой сортировки
        quickSort(0, arr.length - 1);
        //выводим отсотированный массив
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int left, int right) {
        int i = left;
        int j = right;
        int tmp;
        //выбраем опорный элемент
        int cur = arr[(left + right) / 2];
        while (i <= j) {
            //разделяем на подмассивы, который больше и меньше опорного элемента
            while ((arr[i] < cur) && (i < right)) i++;
            while ((cur < arr[j]) && (left < j)) j--;
            //меняем местами
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        //вызов рекурсии для сортировки левой и правой части
        if (i < right) quickSort(i, right);
        if (left < j) quickSort(left, j);
    }
}