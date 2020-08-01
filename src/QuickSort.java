public class QuickSort {
    static int[] arr = {10, 1, 0, 4, 2, 9};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        quickSort(0, arr.length - 1);

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int left, int right) {
        int i = left;
        int j = right;
        int tmp;
        int cur = arr[(left + right) / 2];

        while (i <= j) {
            while ((arr[i] < cur) && (i < right)) i++;
            while ((cur < arr[j]) && (left < j)) j--;

            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        if (i < right) quickSort(i, right);
        if (left < j) quickSort(left, j);
    }
}