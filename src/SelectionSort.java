public class SelectionSort {

    static int[] arr = {10, 1, 0, 4, 2, 9};

    public static void main(String[] args) {
        //Создаем массив

        //выводим неотсотированный массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        int first;
        int second;
        int min;

        for (first = 0; first < arr.length - 1; first++) {
            min = first;

            for (second = first + 1; second < arr.length; second++) {

                min = second;

                swap(second, min);
            }
        }

        System.out.println();
        //выводим отсотированный массив
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }


    public static void swap(int min, int second) {
        int tmp = arr[second];
        arr[min] = arr[second];
        arr[second] = tmp;
    }

}

